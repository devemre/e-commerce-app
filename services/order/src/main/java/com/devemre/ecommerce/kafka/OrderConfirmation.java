package com.devemre.ecommerce.kafka;

import com.devemre.ecommerce.customer.CustomerResponse;
import com.devemre.ecommerce.order.PaymentMethod;
import com.devemre.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
