package br.com.movieflix.controller;

import br.com.movieflix.entity.Category;
import br.com.movieflix.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movieflix/category")
@RequiredArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    public List<Category> getAllGategories() {
        categoryService.findAll()
    }
}
