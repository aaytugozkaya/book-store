package com.aaytugozkaya.bookstore.service;

import com.aaytugozkaya.bookstore.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.aaytugozkaya.bookstore.model.Order;
import com.aaytugozkaya.bookstore.repository.OrderRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final BookService bookService;
    private final OrderRepository orderRepository;
    private final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public OrderService(BookService bookService, OrderRepository orderRepository) {
        this.bookService = bookService;
        this.orderRepository = orderRepository;
    }

    public Order putAnOrder(List<Integer> bookIdList, String userName) {
        List<Optional<Book>> bookList = bookIdList.stream().map(bookId -> bookService.findBookById(bookId)).collect(Collectors.toList());

        Double totalPrice = bookList.stream().
                map(optionalBook -> optionalBook.map(book -> book.getPrice()).orElse(0.0))
                .reduce(0.0, Double::sum);

        Order order = Order.builder()
                .totalPrice(totalPrice)
                .userName(userName)
                .build();

        return orderRepository.save(order);
    }
}