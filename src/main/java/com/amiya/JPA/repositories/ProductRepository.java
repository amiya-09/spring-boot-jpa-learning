package com.amiya.JPA.repositories;

import com.amiya.JPA.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
//import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
//    List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

    List<ProductEntity> findByOrderByPrice();

    List<ProductEntity> findByQuantityAndPrice(int quantity, BigDecimal price);

    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);
}
