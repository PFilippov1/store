package com.pfilippov.autoparts.shop.repository;

import java.util.List;

import com.pfilippov.autoparts.shop.domain.Order;
import com.pfilippov.autoparts.shop.domain.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

	List<Order> findByUser(User user);
	
	@EntityGraph(attributePaths = { "cartItems", "payment", "shipping" })
	Order findEagerById(Long id);

}
