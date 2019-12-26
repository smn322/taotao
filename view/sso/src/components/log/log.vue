<template>
  <div ref="log">
    <el-container>
      <el-main>
        <el-form :model="userInfo" ref="userInfoForm">
          <el-input v-model="userInfo.username" class="mar-top input-width">
            <i slot="append">用户名</i>
          </el-input>
          <el-input v-model="userInfo.password" show-password class="mar-top input-width">
            <i slot="append">密&nbsp;&nbsp;&nbsp;码</i>
          </el-input>
          <br />
          <el-button @click="login" type="primary" class="mar-top">登录</el-button>
          <el-button @click="login" type="primary" class="mar-top">取消</el-button>
        </el-form>
      </el-main>
    </el-container>
  </div>
</template>
<script>
import axios from "axios";
export default {
  data() {
    return {
      userInfo: {
        username: null,
        password: null
      }
    };
  },
  methods: {
    logsuccess(cookie) {
      debugger;
      this.$emit("logsuccess", cookie);
    },
    logfailed() {
      debugger;
      this.$emit("logfailed", {});
    },
    login() {
      this.logsuccess("cookie");
      let data = {
        userAccount: this.userInfo.username,
        password: this.userInfo.password
      };
      axios({
        url: "/taotaomall/sso/log",
        method: "post",
        data
      })
        .then(function(response) {
          let loginData = response.data;
          let code = loginData.code;
          debugger;
          if (1 === code) {
            let token = loginData.data.token;
            let uid = loginData.data.uid;
            let cookie = token + "###" + uid;
            document.cookie = cookie;
            console.log(token);
            this.logsuccess(cookie);
          } else {
            console.log("failed");
            this.logfailed();
          }
        })
        .catch(function(error) {});
    }
  }
};
</script>
<style scoped>
i {
  width: 10%;
  /* background-color: aqua  */
  font-family: Arial, Helvetica, sans-serif;
  font-weight: bold;
  font-size: 18px;
}
.mar-top {
  margin-top: 30px;
}
.input-width {
  width: 58%;
}
</style>