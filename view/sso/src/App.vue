<template>
  <div id="app">
    <log v-on:logsuccess="logsuccess" v-on:logfailed="logfailed"></log>
    <router-view/>
  </div>
</template>

<script>
import Log from '@/components/log/log.vue'
export default {
  name: 'App',
  components:{Log},
  data(){
    return {

    }
  },
  methods:{
    logsuccess(){
      console.log('success')
    },
    logfailed(){
      console.log('failed')
    }
  }

}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
