package com.example.tacocloud.service;

import com.example.tacocloud.entity.TacoOrder;

public interface OrderMessagingService {
    void sendOrder(TacoOrder oder);
}
