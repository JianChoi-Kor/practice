package com.example.practice.redis_hash_indexed_ttl;

import org.springframework.data.repository.CrudRepository;

public interface CouponRedisRepository extends CrudRepository<Coupon, String> {

}
