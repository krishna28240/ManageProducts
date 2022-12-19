package com.baeldung.ecommerce.service;

import com.baeldung.ecommerce.model.Order;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);

    @NotNull List<Order> getAllProductsBetweenDates(LocalDate startDate, LocalDate endDate);

}
