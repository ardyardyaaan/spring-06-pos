package com.eksad.pos.dao;

import java.util.List;

import com.eksad.pos.model.CategoryModel;

public interface CategoryDao {
	
	public List<CategoryModel> getList();
	public List<CategoryModel> search(String key);
	public CategoryModel getById(Integer id);
	public void insert(CategoryModel model);
	public void update(CategoryModel model);
	public void delete(CategoryModel model);
	
}
