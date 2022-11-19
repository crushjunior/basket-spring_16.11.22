package com.skypro.basketspring.controller;

import com.skypro.basketspring.model.Item;
import com.skypro.basketspring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping("/order/get")
    public List<Item> getBasket() {
        return this.basketService.getBasket();
    }

    @GetMapping("/order/add")
    public void addItem(@RequestParam(name = "item", required = false) List<Integer> ids) {
        this.basketService.addItems(ids);
    }
}

