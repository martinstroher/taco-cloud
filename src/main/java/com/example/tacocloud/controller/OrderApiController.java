package com.example.tacocloud.controller;

import com.example.tacocloud.entity.TacoOrder;
import com.example.tacocloud.repository.OrderRepository;
import com.example.tacocloud.service.OrderMessagingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/orders", produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
public class OrderApiController {
    private OrderRepository orderRepository;
    private OrderMessagingService orderMessagingService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TacoOrder postOrder(@RequestBody TacoOrder tacoOrder) {
        orderMessagingService.sendOrder(tacoOrder);
        return orderRepository.save(tacoOrder);
    }
}
