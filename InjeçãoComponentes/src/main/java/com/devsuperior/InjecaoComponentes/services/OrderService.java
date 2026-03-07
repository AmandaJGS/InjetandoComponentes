package com.devsuperior.InjecaoComponentes.services;

import com.devsuperior.InjecaoComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double total(Order order){
        double resultado;
        return resultado = order.getBasic() - (order.getBasic() * order.getDiscount() / 100);
    }
}
