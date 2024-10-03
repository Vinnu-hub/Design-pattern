package org.example.ObserverDesignpattern;

public class Subscriber {

    private String name;
    private Channel channel =new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update()
    {
        System.out.println(" Hey " + name +",:video is uploaded,"+ channel.title );
    }
    public void Subscribechannel(Channel ch)
    {
        channel=ch;
    }
}
