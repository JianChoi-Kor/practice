package com.example.practice.redis_hash_indexed_ttl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "coupon", timeToLive = 10)
public class Coupon {

    @Id
    private String id;
    private String name;
    @Indexed
    private String code;
}
