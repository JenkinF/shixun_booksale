package com.dao;
import com.entity.*;

import java.util.*;
public interface CategoryDAO {
	List<Category> selectAll();
	void add(Category ct);
	Category findById(int id);
	void update(Category category);
	void delete(int id);
	void deleteProduct(int id); //这里的id是商品表的图书分类id
	List<Category> search(String key);
	Integer isNoneCategory(int id);
}
