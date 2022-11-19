package com.skypro.basketspring.model;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Repository
@SessionScope
public class Basket {
    private final List<Item> basket;

    public Basket(List<Item> basket) {
        this.basket = basket;
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void addItem(Item item) {
        basket.add(item);
    }
}
