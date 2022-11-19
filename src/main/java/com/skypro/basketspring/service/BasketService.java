package com.skypro.basketspring.service;

import com.skypro.basketspring.model.Basket;
import com.skypro.basketspring.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    @Autowired
    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public List<Item> getBasket() {
        return basket.getBasket();
    }

    public void addItems(List<Integer> ids) {
        for (Integer integer : ids) {
            basket.addItem(new Item(integer));
        }
    }
}
