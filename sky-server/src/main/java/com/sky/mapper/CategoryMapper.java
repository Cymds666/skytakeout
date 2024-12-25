package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 79878
 * @version 1.0
 * Create by 2024/12/25 16:17
 */
@Mapper
public interface CategoryMapper {

    Page<Category> pageSelect(CategoryPageQueryDTO queryDTO);

    void update(Category category);

    List<Category> selectByType(String type);

    @Delete("delete from category where id = #{id}")
    void delete(Long id);

    void add(Category category);
}
