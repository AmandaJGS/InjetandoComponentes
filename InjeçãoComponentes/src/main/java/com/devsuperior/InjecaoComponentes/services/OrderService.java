package com.devsuperior.InjecaoComponentes.services;

import com.devsuperior.InjecaoComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double discountAmount = order.getBasic() * order.getDiscount() / 100.0;
        double basicWithDiscount = order.getBasic() - discountAmount;
        double shipping = shippingService.shipment(order);
        return basicWithDiscount + shipping;
    }
}
