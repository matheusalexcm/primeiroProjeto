package com.br.primeiroProjeto.demo.service;

import com.br.primeiroProjeto.demo.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Double total (Order order) {
        ShippingService service = new ShippingService();
        Double frete = service.frete(order);
        return order.getBasic() - (order.getBasic() * order.getDiscount() / 100) + frete;
    }
}
