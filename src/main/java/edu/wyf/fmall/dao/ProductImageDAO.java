package edu.wyf.fmall.dao;
 
import java.util.List;

import edu.wyf.fmall.pojo.Product;
import edu.wyf.fmall.pojo.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}
