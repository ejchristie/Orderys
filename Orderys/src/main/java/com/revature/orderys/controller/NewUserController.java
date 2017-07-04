//package com.revature.orderys.controller;
//
//import java.util.ArrayList;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.revature.orderys.bean.Order;
//import com.revature.orderys.bean.OrderItem;
//import com.revature.orderys.bean.Rating;
//import com.revature.orderys.bean.User;
//import com.revature.orderys.service.Service;
//
///**
// * The controller that handles requests to URIs starting with /user.
// * Methods in this controller should be available for customers attempting 
// * to access their own account, or for all users if labeled as such.
// * @author Eric Christie
// *
// */
//@RestController
//@RequestMapping(value="/user")
//public class NewUserController {
//	
//	@Autowired
//	Service service;
//	
//	public NewUserController() {
//		super();
//	}
//
//	public void setService(Service service) {
//		this.service = service;
//	}
//	
////	/**
////	 * get list of all users
////	 */
////	@RequestMapping(value="", method=RequestMethod.GET)
////	/**
////	 * add a new user
////	 */
////	@RequestMapping(value="", method=RequestMethod.POST)
//	
//	/**
//	 * get account information for specified user
//	 */
//	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
//	public User getUser(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId) {
//		User u = null;
//		u = service.getUserById(userId);
//		return u;
//	}
//	/**
//	 * update account information for specified user
//	 */
//	@RequestMapping(value="/{userId}", method=RequestMethod.POST)
//	public User updateUser(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId, ) {
//		
//	}
////	/**
////	 * update account information for specified user
////	 */
////	@RequestMapping(value="/{userId}", method=RequestMethod.PUT)
////	/**
////	 * delete specified user
////	 */
////	@RequestMapping(value="/{userId}", method=RequestMethod.DELETE)
//	
//	/**
//	 * get list of all orders placed by specified user
//	 */
//	@RequestMapping(value="/{userId}/order", method=RequestMethod.GET)
//	public ArrayList<Order> getOrders(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId) {
//		
//	}
//	/**
//	 * place a new order as specified user
//	 */
//	@RequestMapping(value="/{userId}/order", method=RequestMethod.POST)
//	public Order placeOrder(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId) {
//		
//	}
//	
//	/**
//	 * get information for specified order placed by specified user
//	 */
//	@RequestMapping(value="/{userId}/order/{orderId}", method=RequestMethod.GET)
//	public Order getOrder(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId, @PathVariable(value="orderId") long orderId) {
//		
//	}
//	/**
//	 * update (cancel) specified order placed by specified user
//	 */
//	@RequestMapping(value="/{userId}/order/{orderId}", method=RequestMethod.POST)
//	public Order cancelOrder(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId, @PathVariable(value="orderId") long orderId) {
//		
//	}
////	/**
////	 * update (cancel) specified order placed by specified user
////	 */
////	@RequestMapping(value="/{userId}/order/{orderId}", method=RequestMethod.PUT)
////	/**
////	 * delete specified order placed by specified user
////	 */
////	@RequestMapping(value="/{userId}/order/{orderId}", method=RequestMethod.DELETE)
//	
//	/**
//	 * get list of order items included in specified order placed by specified user
//	 */
//	@RequestMapping(value="/{userId}/order/{orderId}/item", method=RequestMethod.GET)
//	public ArrayList<OrderItem> getOrderItems(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId, @PathVariable(value="orderId") long orderId) {
//		
//	}
//	
//	/**
//	 * get information about a specific order item included in specified order placed by specified user
//	 */
//	@RequestMapping(value="/{userId}/order/{orderId}/item/{productId}", method=RequestMethod.GET)
//	public OrderItem getOrderItem(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId, @PathVariable(value="orderId") long orderId) {
//		
//	}
//	
////	/**
////	 * 
////	 */
////	@RequestMapping(value="/{userId}/order/{orderId}/item/{productId}/rating", method=RequestMethod.GET)
//	/**
//	 * submit or update specified user's rating of the product included as an order item in the 
//	 * specified order if the order is completed
//	 * (prevents user's from rating products they have not received)
//	 */
//	@RequestMapping(value="/{userId}/order/{orderId}/item/{productId}/rating", method=RequestMethod.POST)
//	public Rating submitRating(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId) {
//		
//	}
////	/**
////	 * submit or update specified user's rating of the product included as an order item in the 
////	 * specified order if the order is completed
////	 * (prevents user's from rating products they have not received)
////	 */
////	@RequestMapping(value="/{userId}/order/{orderId}/item/{productId}/rating", method=RequestMethod.PUT)
////	/**
////	 * delete specified user's rating of the product included as an order item in the specified order
////	 */
////	@RequestMapping(value="/{userId}/order/{orderId}/item/{productId}/rating", method=RequestMethod.DELETE)
//	
//	/**
//	 * get list of all ratings submitted by specified user
//	 */
//	@RequestMapping(value="/{userId}/rating", method=RequestMethod.GET)
//	public ArrayList<Rating> getRatings(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable(value="userId") long userId) {
//		
//	}
//	
//	
////	/**
////	 * update specified user's rating of specified product
////	 */
////	@RequestMapping(value="/{userId}/rating/{productId}", method=RequestMethod.POST)
////	/**
////	 * update specified user's rating of specified product
////	 */
////	@RequestMapping(value="/{userId}/rating/{productId}", method=RequestMethod.PUT)
////	/**
////	 * delete specified user's rating of specified product
////	 */
////	@RequestMapping(value="/{userId}/rating/{productId}", method=RequestMethod.DELETE)
//	
//}
