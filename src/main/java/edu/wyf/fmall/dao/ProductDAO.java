package edu.wyf.fmall.dao;

import edu.wyf.fmall.pojo.Category;
import edu.wyf.fmall.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Integer>{
	Page<Product> findByCategory(Category category, Pageable pageable);
	List<Product> findByCategoryOrderById(Category category);
	List<Product> findByNameLike(String keyword, Pageable pageable);

}
