package com.example.practice.redis_hash_indexed_ttl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coupon")
public class CouponController {

    private final CouponRedisRepository couponRedisRepository;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        Coupon coupon = Coupon.builder()
                .name("테스트쿠폰1")
                .code("89c539c4")
                .build();

        couponRedisRepository.save(coupon);

        return ResponseEntity.ok(coupon);
    }
}
