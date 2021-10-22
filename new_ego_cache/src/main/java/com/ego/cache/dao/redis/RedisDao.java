package com.ego.cache.dao.redis;

import com.ego.cache.dao.EgoCacheDao;

import java.util.concurrent.TimeUnit;

//专门用于redis读写访问
public interface RedisDao extends EgoCacheDao {
    void setValue(String key, Object value, long times, TimeUnit unit);

    Object getValue(String key);

    Long ttl(String key);

    Boolean setExpire(String key,long times,TimeUnit unit);

    Long del(String... keys);
}
