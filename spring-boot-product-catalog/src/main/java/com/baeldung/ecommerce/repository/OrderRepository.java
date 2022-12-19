package com.baeldung.ecommerce.repository;

import com.baeldung.ecommerce.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    @Query(value = "from Order t where dateCreated BETWEEN :startDate AND :endDate")
    public List<Order> getAllProductsBetweenDates(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
