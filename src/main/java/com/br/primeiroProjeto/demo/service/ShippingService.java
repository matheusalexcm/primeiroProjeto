package com.br.primeiroProjeto.demo.service;

import com.br.primeiroProjeto.demo.model.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double frete (Order order) {
        if(order.getBasic() < 100) {
            return 20.00;
        } else if(order.getBasic() < 200) {
            return 12.00;
        }
        return 0.00;
    }
}
