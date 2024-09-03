package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 菜品管理
 */
@RestController
@RequestMapping("/admin/dish")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;

    /**
     * 新增菜品
     * @param dto
     * @return
     */
    @PostMapping
    public Result save(@RequestBody DishDTO dto){
        log.info("新增菜品：{}", dto);
        dishService.saveWithFlavor(dto);

        return Result.success();
    }

    @GetMapping("/page")
    public Result<PageResult> page(DishPageQueryDTO pageQueryDTO){
        PageResult pageResult = dishService.pageQuery(pageQueryDTO);
        return Result.success(pageResult);
    }

}
