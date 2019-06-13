package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.CategoryDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface CategoryService {
    public void addCategory(CategoryDTO category);
    public List<CategoryDTO> findCategories(CategoryDTO category);
    public List<CategoryDTO> findCategoriesByword(CategoryDTO category);
    public CategoryDTO findCategoryBycategoryId(CategoryDTO category);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(CategoryDTO category);
}

// CustomerService cs = new CustomerServiceImpl()
// type정리