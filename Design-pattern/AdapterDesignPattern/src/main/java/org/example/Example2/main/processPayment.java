package org.example.Example2.main;

import org.example.Example2.adapter.paymentadapter;
import org.example.Example2.legacy.Paypal;
import org.example.Example2.paymentprocess;

public class processPayment {
    public static void main(String args[]) {

        paymentprocess paymentprocess = new paymentadapter(new Paypal());
        paymentprocess.processpayment(100.0);

    }
}
