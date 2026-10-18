package com.project.spring.boot.blueprint;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    private final RedisService redisService;

    public RedisController(RedisService redisService) {
        this.redisService = redisService;
    }

    @PostMapping
    public void saveRedis() {
        redisService.save("123", "sokhs");
    }

    @GetMapping
    public String getRedis() {
        return redisService.get("123");
    }

    @DeleteMapping
    public void deleteRedis() {
        redisService.delete("123");
    }
}
