package com.aaytugozkaya.bookstore.controller;

import com.aaytugozkaya.bookstore.dto.BookOrderRequest;
import com.aaytugozkaya.bookstore.model.Order;
import com.aaytugozkaya.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/bookstore")
public class BookStoreController {

    private OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> helloEverybody(){
        return ResponseEntity.ok("Hello Everyboooody!!!");
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(),bookOrderRequest.getUserName());
        return ResponseEntity.ok(order);
    }
}
