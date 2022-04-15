package com.pfilippov.autoparts.shop.service;

import com.pfilippov.autoparts.shop.domain.Article;
import com.pfilippov.autoparts.shop.domain.CartItem;
import com.pfilippov.autoparts.shop.domain.ShoppingCart;
import com.pfilippov.autoparts.shop.domain.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);
	
	int getItemsNumber(User user);
	
	CartItem findCartItemById(Long cartItemId);
	
	CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);
		
	void clearShoppingCart(User user);
	
	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);
	
}
