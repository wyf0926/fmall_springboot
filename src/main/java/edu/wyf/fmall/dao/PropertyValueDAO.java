package edu.wyf.fmall.dao;
 

import java.util.List;

import edu.wyf.fmall.pojo.Product;
import edu.wyf.fmall.pojo.Property;
import edu.wyf.fmall.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}
