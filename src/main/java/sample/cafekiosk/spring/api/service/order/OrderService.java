package sample.cafekiosk.spring.api.service.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sample.cafekiosk.spring.api.service.order.request.OrderCreateRequest;
import sample.cafekiosk.spring.api.service.order.response.OrderResponse;

@Service
@RequiredArgsConstructor
public class OrderService {

    public OrderResponse createOrder(OrderCreateRequest orderCreateRequest){
        return null;
    }
}