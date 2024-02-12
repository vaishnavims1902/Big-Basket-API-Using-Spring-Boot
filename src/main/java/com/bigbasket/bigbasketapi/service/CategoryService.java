package com.bigbasket.bigbasketapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bigbasket.bigbasketapi.model.CategoryModel;
import com.bigbasket.bigbasketapi.repository.CategoryRepository;

import jakarta.persistence.EntityNotFoundException;


@Service
public class CategoryService {
   private CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository =categoryRepository;
    }

    public List<CategoryModel> getAllCategories() {
        return categoryRepository.findAll();
    }

    public List<CategoryModel> createCategories(List<CategoryModel> categoryModels) {
        return categoryRepository.saveAll(categoryModels);
    }
    public CategoryModel updatecCategory(int id, CategoryModel updatedCategory) {
        CategoryModel existingData = categoryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found with id: " + id));

                existingData.setCategoryId(updatedCategory.getCategoryId());
                existingData.setCategoryName(updatedCategory.getCategoryName());
        return categoryRepository.save(existingData);
 }

    public void deleteCategoryById(int id) {
        categoryRepository.deleteById(id);
    }
}
