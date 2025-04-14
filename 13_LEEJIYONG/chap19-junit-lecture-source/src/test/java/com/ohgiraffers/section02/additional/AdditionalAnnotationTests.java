package com.ohgiraffers.section02.additional;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/* JUnit에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다. */
public class AdditionalAnnotationTests {


    @Disabled
    @Test
    void testIgnore() {
        System.out.println("테스트 실행 확인");
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        try {
            Thread.sleep(990);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("타임아웃테스트");
    }


    @Test
    @Order(1)
    void testFirst() {
        System.out.println("first");
    }

    @Test
    @Order(3)
    void testSecond() {
        System.out.println("second");
    }

    @Test
    @Order(2)
    void testThird() {
        System.out.println("third");
    }

    @RepeatedTest(10)
    void testRepeated() {
        System.out.println("반복테스트");
    }
}
