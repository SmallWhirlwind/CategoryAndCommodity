package com.thoughtworks.gaia.tableA.service;

import com.thoughtworks.gaia.common.Loggable;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.tableA.CategoryMapper;
import com.thoughtworks.gaia.tableA.dao.CategoryDao;
import com.thoughtworks.gaia.tableA.entity.Category;
import com.thoughtworks.gaia.tableA.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by haoyuze on 2017/4/28.
 */
@Component
@Transactional
public class CategoryService implements Loggable {
    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CategoryMapper categoryMapper;

    public Category getCategories(Long categoryId){
        CategoryModel categoryModel = categoryDao.idEquals(categoryId).querySingle();
        if(categoryModel == null){
            throw new NotFoundException();
        }
        return categoryMapper.map(categoryModel,Category.class);
    }
}
