package com.sky.controller.admin;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.mapper.CategoryMapper;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     * 分页查询
     * @param queryDTO
     * @return
     */
    @GetMapping("/page")
    public Result<PageResult> page(CategoryPageQueryDTO queryDTO) {
        PageResult pageResult = categoryService.page(queryDTO);
        return Result.success(pageResult);
    }

    @PostMapping("/status/{status}")
    public Result changeStatus(@PathVariable("status") Integer status, Long id) {
        categoryService.changeStatus(status, id);
        return Result.success();
    }

    @GetMapping("/list")
    public Result<List<Category>> list(@RequestParam String type) {
        List<Category> list = categoryService.selectList(type);
        return Result.success(list);
    }

    @PutMapping
    public Result update(@RequestBody CategoryDTO categoryDTO) {
        categoryService.update(categoryDTO);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(@RequestParam Long id) {
        categoryService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody CategoryDTO categoryDTO) {
        categoryService.add(categoryDTO);
        return Result.success();
    }
}
