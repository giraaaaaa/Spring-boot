package com.bit.web.serviceImpl;


import java.util.List;

import com.bit.web.domain.CategoryDTO;
import com.bit.web.service.CategoryService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public void addCategory(CategoryDTO category) {

    }

    @Override
    public List<CategoryDTO> findCategories(CategoryDTO category) {
        return null;
    }

    @Override
    public List<CategoryDTO> findCategoriesByword(CategoryDTO category) {
        return null;
    }

    @Override
    public CategoryDTO findCategoryBycategoryId(CategoryDTO category) {
        return null;
    }

    @Override
    public void updateCategory(CategoryDTO category) {

    }

    @Override
    public void deleteCategory(CategoryDTO category) {

    }

    
}