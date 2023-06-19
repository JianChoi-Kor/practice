package com.example.practice.redis_hash_indexed_ttl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coupon")
public class CouponController {

    private final CouponRedisRepository couponRedisRepository;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        Coupon coupon1 = Coupon.builder()
                .name("테스트쿠폰1")
                .code("89c539c4")
                .build();

        Coupon coupon2 = Coupon.builder()
                .name("테스트쿠폰2")
                .code("23a85d31")
                .build();

        Coupon coupon3 = Coupon.builder()
                .name("테스트쿠폰3")
                .code("923ea19b8")
                .build();

        couponRedisRepository.save(coupon1);
        couponRedisRepository.save(coupon2);
        couponRedisRepository.save(coupon3);

        return ResponseEntity.ok("saved");
    }
}
