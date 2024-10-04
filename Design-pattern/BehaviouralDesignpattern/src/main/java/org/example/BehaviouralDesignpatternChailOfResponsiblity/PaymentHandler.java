package org.example.BehaviouralDesignpatternChailOfResponsiblity;
/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 * Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
 *
 * The Chain of Responsibility pattern allows a number of classes to attempt to handle a request independently.
 *
 * Reference: https://refactoring.guru/design-patterns/chain-of-responsibility
 **/

/**
 *
 *  Hi these is vibay iam learning the Chain of responsibility from
 *  for the Behavioural Design pattern
 *
 *
 *
 *
 **/

public abstract class PaymentHandler
{
    protected PaymentHandler next;

     public void setNext(PaymentHandler next)
     {
          this.next=next;
     }
     public abstract void handlePayment(double amount);
}