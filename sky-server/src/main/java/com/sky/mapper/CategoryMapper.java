package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 79878
 * @version 1.0
 * Create by 2024/12/25 16:17
 */
@Mapper
public interface CategoryMapper {

    Page<Category> pageSelect(CategoryPageQueryDTO queryDTO);
}
