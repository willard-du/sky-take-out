package com.sky.service;


import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    void add(ShoppingCartDTO shoppingCartDTO);


    /**
     * 展示购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();
}
