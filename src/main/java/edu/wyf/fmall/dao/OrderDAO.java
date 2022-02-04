package edu.wyf.fmall.dao;
 
import java.util.List;

import edu.wyf.fmall.pojo.Order;
import edu.wyf.fmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
