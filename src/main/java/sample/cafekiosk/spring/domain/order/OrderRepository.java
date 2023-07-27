package sample.cafekiosk.spring.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.cafekiosk.spring.domain.product.Product;
import sample.cafekiosk.spring.domain.product.ProductSellingStatus;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
