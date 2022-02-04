package edu.wyf.fmall.dao;
 
import edu.wyf.fmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
