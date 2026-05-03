package com.lecturer.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("/order/list")
    public Map<String, Object> list() {
        return Map.of("service", "order-service", "orders", 3, "status", "ok");
    }
}
