package org.example.ObserverDesignpattern;

public class Youtube
{
    public static void main(String args[])
    {
        Channel channel=new Channel();

        Subscriber s1=new Subscriber("vinay");
        Subscriber s2=new Subscriber("nandi");
        Subscriber s3=new Subscriber("ravi");
        Subscriber s4=new Subscriber("raghu");
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);

        s1.Subscribechannel(channel);
        s2.Subscribechannel(channel);
        s3.Subscribechannel(channel);

        s4.Subscribechannel(channel);
        channel.upload("how to learn programming ??");
    }
}
