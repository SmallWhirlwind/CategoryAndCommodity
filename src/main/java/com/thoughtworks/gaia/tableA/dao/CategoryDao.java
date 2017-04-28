package com.thoughtworks.gaia.tableA.dao;

import com.thoughtworks.gaia.common.jpa.BaseDaoWrapper;
import com.thoughtworks.gaia.tableA.model.CategoryModel;

/**
 * Created by haoyuze on 2017/4/28.
 */
public class CategoryDao  extends BaseDaoWrapper<CategoryModel> {
    public CategoryDao(){
        super(CategoryModel.class);
    }
}
