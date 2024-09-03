package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品和口味
     * @param dto
     */
    public void saveWithFlavor(DishDTO dto);

    /**
     * 菜品分页查询
     * @param pageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO pageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);
}
