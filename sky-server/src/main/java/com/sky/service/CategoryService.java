package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

/**
 * @author 79878
 * @version 1.0
 * Create by 2024/12/25 16:13
 */

public interface CategoryService {

    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);

    void changeStatus(Integer status, Long id);

    List<Category> selectList(String type);

    void update(CategoryDTO categoryDTO);

    void delete(Long id);

    void add(CategoryDTO categoryDTO);
}
