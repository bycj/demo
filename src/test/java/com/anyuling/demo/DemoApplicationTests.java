package com.anyuling.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,5,0, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        for (int i =0; i<100; i++) {
            int finalI = i;
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(finalI);
                }
            });
        }
    }

}
