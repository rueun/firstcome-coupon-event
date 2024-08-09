package com.example.couponcore;

// coupon core 는 애플리케이션으로 띄우는 것이 아니고 라이브러리로 사용하기 위한 모듈이다.
// 따라서 Configuration 설정만 존재하고, @SpringBootApplication 어노테이션은 존재하지 않는다.

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class CouponCoreConfiguration {
}
