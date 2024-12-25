package com.sky.controller.admin;

import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 79878
 * @version 1.0
 * Create by 2024/12/25 16:05
 */

@RestController
@RequestMapping("/admin/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/page")
    public Result<PageResult> page(CategoryPageQueryDTO queryDTO) {
        PageResult pageResult = categoryService.page(queryDTO);
        return Result.success(pageResult);
    }
}
