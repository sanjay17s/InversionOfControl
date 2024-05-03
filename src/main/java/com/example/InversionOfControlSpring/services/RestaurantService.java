package com.example.InversionOfControlSpring.services;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    private KitchenService kitchenService;

    public RestaurantService(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    public void doProcess() {
        System.out.println("Order taken");
        kitchenService.cookFood();
    }

}
