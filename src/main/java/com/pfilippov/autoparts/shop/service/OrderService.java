package com.pfilippov.autoparts.shop.service;

import java.util.List;

import com.pfilippov.autoparts.shop.domain.Order;
import com.pfilippov.autoparts.shop.domain.Payment;
import com.pfilippov.autoparts.shop.domain.Shipping;
import com.pfilippov.autoparts.shop.domain.ShoppingCart;
import com.pfilippov.autoparts.shop.domain.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
