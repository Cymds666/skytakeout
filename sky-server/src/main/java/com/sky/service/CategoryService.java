package com.sky.service;

import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;

/**
 * @author 79878
 * @version 1.0
 * Create by 2024/12/25 16:13
 */

public interface CategoryService {

    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);
}
