package com.islandercart.orders;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    // Create a new order
    @PostMapping
    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.createOrder(orderDTO);
    }

    // Get an order by its ID
    @GetMapping("/{id}")
    public OrderDTO getOrderById(@PathVariable("id") String id) {
        return orderService.getOrderById(id);
    }
    
    // Update an order by its ID
    @PutMapping("/{id}")
    public String updateOrderById(@PathVariable("id") String id, @RequestBody OrderDTO orderDTO) {
        return orderService.updateOrderById(id,orderDTO);
    }

    // Get all orders
    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Delete an order by ID
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") String id) {
        orderService.deleteOrder(id);
    }

    // Get orders by user ID
    @GetMapping("/user/{userId}")
    public List<OrderDTO> getOrdersByUserId(@PathVariable("userId") String userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
