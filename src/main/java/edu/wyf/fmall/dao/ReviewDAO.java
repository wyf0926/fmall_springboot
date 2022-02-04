package edu.wyf.fmall.dao;
 
import java.util.List;

import edu.wyf.fmall.pojo.Product;
import edu.wyf.fmall.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDAO extends JpaRepository<Review,Integer>{

	List<Review> findByProductOrderByIdDesc(Product product);
	int countByProduct(Product product);

}
