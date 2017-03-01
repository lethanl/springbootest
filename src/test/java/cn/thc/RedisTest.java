package cn.thc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * Created by thc on 2017/2/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootestApplication.class)
public class RedisTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSetRedis(){
        ValueOperations<String,String> valueOperations = stringRedisTemplate.opsForValue();
        valueOperations.set("1","test",60, TimeUnit.SECONDS);
    }

}