package com.devsuperior.InjecaoComponentes.services;

import com.devsuperior.InjecaoComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order basic) {
        if (basic.getBasic() < 100.0) {
            return 20.0;
        } else if (basic.getBasic() < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
