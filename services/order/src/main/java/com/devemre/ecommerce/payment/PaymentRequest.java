package com.devemre.ecommerce.payment;

import com.devemre.ecommerce.customer.CustomerResponse;
import com.devemre.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
