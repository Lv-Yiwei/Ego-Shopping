package com.ego.cache.dao.redis.impl;

import com.ego.cache.dao.redis.RedisDao;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

//专门处理redis访问操作的数据访问对象
public class RedisDaoImpl implements RedisDao {
    private RedisTemplate<String, Object> redisTemplate;

    //根据key批量删除数据
    @Override
    public Long del(String... keys) {
        if (keys == null || keys.length == 0) {
            return -1L;//key参数错误
        }
        return redisTemplate.delete(Arrays.asList(keys));
    }

    //设置key的有效生命周期
    @Override
    public Boolean setExpire(String key, long times, TimeUnit unit) {
        return redisTemplate.expire(key, times, unit);
    }


    //根据key获取数据的剩余有效时长
    @Override
    public Long ttl(String key) {
        return redisTemplate.getExpire(key);
    }

    //根据key值查询value
    @Override
    public Object getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    //保存字符串数据到redis
    @Override
    public void setValue(String key, Object value, long times, TimeUnit unit) {
        if (times < 0) {
            //无有效时长
            redisTemplate.opsForValue().set(key, value);
            return;
        }
        //有有效时长的
        redisTemplate.opsForValue().set(key, value, times, unit);
    }

    public RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
