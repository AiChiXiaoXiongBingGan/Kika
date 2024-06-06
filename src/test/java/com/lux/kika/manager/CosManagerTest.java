package com.lux.kika.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Cos 操作测试
 *
 * @author <a href="https://github.com/AiChiXiaoXiongBingGan">lux</a>
 * @from <a href="https://lux.icu">hit</a>
 */
@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void putObject() {
        cosManager.putObject("test", "test.json");
    }
}