package com.bit.web.mapper;

import java.util.List;

import com.bit.web.domain.CategoryDTO;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 */
@Repository
public interface CategoryMapper {
    public void addCategory(CategoryDTO category);
    public List<CategoryDTO> selectCategories(CategoryDTO category);
    public List<CategoryDTO> selectCategoriesByword(CategoryDTO category);
    public CategoryDTO selectCategoryBycategoryId(CategoryDTO category);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(CategoryDTO category);

    
}