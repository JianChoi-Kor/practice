package com.example.practice.concurrent_hash_map_test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor
@RestController
public class ConCurrentHashMapController {

    private final ConcurrentHashMap <String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();

    @PostMapping("putTest")
    public ResponseEntity<?> putTest(@RequestParam("key") String key,
                                     @RequestParam("value") String value) {
        System.out.println("key : " + key);
        System.out.println("value : " +  value);

        concurrentHashMap.put("key1", "value1");
        System.out.println("size: " + concurrentHashMap.size());


        concurrentHashMap.put("key1", "changeValue1");

        return ResponseEntity.ok(null);
    }
}
