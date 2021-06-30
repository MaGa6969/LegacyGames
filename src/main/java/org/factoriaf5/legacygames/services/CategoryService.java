package org.factoriaf5.legacygames.services;

import org.factoriaf5.legacygames.models.Category;
import org.factoriaf5.legacygames.models.CategoryRepository;
import org.factoriaf5.legacygames.models.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> allCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    public Category getCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }
}
