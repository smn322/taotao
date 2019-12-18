package com.smn.it.taotaomall.sso.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.params.SetParams;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class RedisConfig {

    private static final String OK = "OK";

    private static final int MAX_TOTAL = 20;

    @Value("${spring.redis.cluster.nodes:\"\"}")
    private String clusterNodes;

    @Autowired
    private JedisCluster jedisCluster;

    @Bean
    public JedisCluster jedisCluster() {
        Set<HostAndPort> hostAndPorts = new HashSet<>();
        String[] split = clusterNodes.split(",");
        HostAndPort hostAndPort = null;
        for (String hostAndPortStr : split
        ) {
            int index = hostAndPortStr.indexOf(":");
            String host = hostAndPortStr.substring(0, index);
            String port = hostAndPortStr.substring(index + 1);
            hostAndPort = new HostAndPort(host, Integer.valueOf(port));
            hostAndPorts.add(hostAndPort);
        }
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(MAX_TOTAL);
        jedisPoolConfig.setMaxIdle(5);
        JedisCluster jedisCluster = new JedisCluster(hostAndPorts, jedisPoolConfig);
        return jedisCluster;
    }

    /**
     *
     * @param key
     * @param UID
     * @param expiredTime
     * @return
     */
    public boolean putTokenIfAbsent(String key, String UID, long expiredTime) {
        String set = jedisCluster.set(key, UID, SetParams.setParams().nx().px(expiredTime));
        return OK.equals(set);
    }


}
