package com.ShoppingCart.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ShoppingCart.entity.Product;

@RestController
public class ShoppingCartController {
	public Product product;

	// POST API - fetch all order history ( filter API for filter
	// results for given data range etc.
	@PostMapping("/history-of-product")
	public String addHistoryDetails() throws IOException {
		return "working fine...";
	}

	// GET API - tracking order details
	@GetMapping("/track-order")
	public String trackOrderDetails() throws IOException {
		return "working fine...";
	}

	// GET API - fetching product details
	@GetMapping("/track-product")
	public String trackProductDetails() throws IOException {
		return "working fine...";
	}

	// POST API - adding product details(only for setter type users)
	@PostMapping("/add-product")
	public String addProductDetails() throws IOException {
		return "working fine...";
	}

	// DELETE API - to delete any product(only for setter type users)
	@DeleteMapping("/delete-product")
	public String deleteProductDetails() throws IOException {
		return "working fine...";
	}
}
