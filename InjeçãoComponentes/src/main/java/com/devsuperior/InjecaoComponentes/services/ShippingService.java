package com.devsuperior.InjecaoComponentes.services;

import com.devsuperior.InjecaoComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        if (order.getBasic() < 100){
            return order.getBasic() + 20;
        }else if (order.getBasic() > 100 && order.getBasic() < 200){
            return order.getBasic() + 12;
        } else {
            return order.getBasic();
        }

    }
}
