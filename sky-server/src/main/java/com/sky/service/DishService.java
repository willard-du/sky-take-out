package com.sky.service;

import com.sky.dto.DishDTO;

public interface DishService {

    /**
     * 新增菜品和口味
     * @param dto
     */
    public void saveWithFlavor(DishDTO dto);
}
