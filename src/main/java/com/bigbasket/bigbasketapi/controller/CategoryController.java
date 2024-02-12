package com.bigbasket.bigbasketapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bigbasket.bigbasketapi.model.CategoryModel;
import com.bigbasket.bigbasketapi.service.CategoryService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public CategoryModel getCategory() {
        return new CategoryModel();
    }

    @GetMapping("/GetAllCategory")
    public List<CategoryModel> getAllCategory() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/CreateCategories")
    public boolean createCategories(@RequestBody List<CategoryModel> categoryModels) {
        categoryService.createCategories(categoryModels);
        
        return true;
    }

    @DeleteMapping("/DeleteCategoryById/{id}")
    public  boolean  deleteProductById(@PathVariable int id){
        categoryService.deleteCategoryById(id);
        return true;
    }
    
    @PutMapping("/UpdateCategory/{id}")
    public boolean putMethodName(@PathVariable int id, @RequestBody CategoryModel updatedCategory) {
        categoryService.updatecCategory(id, updatedCategory);
        return true;
    }
    
}
