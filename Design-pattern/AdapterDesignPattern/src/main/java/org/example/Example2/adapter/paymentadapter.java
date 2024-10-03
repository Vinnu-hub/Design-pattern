package org.example.Example2.adapter;

import org.example.Example2.legacy.Paypal;
import org.example.Example2.paymentprocess;

public class paymentadapter implements paymentprocess
{
    private Paypal paypal;

    public paymentadapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processpayment(double amount) {
        paypal.makepayment(amount);

    }
}
