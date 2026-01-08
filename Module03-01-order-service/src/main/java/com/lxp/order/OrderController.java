package com.lxp.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public ResponseEntity<String> orders() {
        return ResponseEntity.ok("Order Service is working!");
    }

}
