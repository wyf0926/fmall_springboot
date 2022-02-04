package edu.wyf.fmall.dao;

import java.util.List;

import edu.wyf.fmall.pojo.Order;
import edu.wyf.fmall.pojo.OrderItem;
import edu.wyf.fmall.pojo.Product;
import edu.wyf.fmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}
