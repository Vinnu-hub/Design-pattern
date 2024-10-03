package org.example.BridgedDesignpattern;
//package org.example.BridgeDesignPattern;

// Implementor interface
public interface Device
{
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

// Concrete Implementor: Sony TV
class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning on the Sony TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Sony TV.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting the volume of Sony TV to " + volume);
    }
}

// Concrete Implementor: Jio TV
class JioTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning on the Jio TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Jio TV.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting the volume of Jio TV to " + volume);
    }
}


// Abstract Abstraction
abstract class RemoteControl
{
    protected Device device;

    protected RemoteControl(Device device)
    {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}

// Refined Abstraction: Basic Remote Control
class BasicRemote extends RemoteControl
{
    public BasicRemote(Device device)
    {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }


// Client code

    public static void main(String[] args)
    {
        Device sonyTV = new SonyTV();
        Device jioTV = new JioTV();

        RemoteControl basicRemoteForSonyTV = new BasicRemote(sonyTV);
        RemoteControl basicRemoteForJioTV = new BasicRemote(jioTV);

        // Using the basic remote for Sony TV
        basicRemoteForSonyTV.turnOn();
        basicRemoteForSonyTV.setVolume(10);
        basicRemoteForSonyTV.turnOff();

        System.out.println();

        // Using the basic remote for Jio TV
        basicRemoteForJioTV.turnOn();
        basicRemoteForJioTV.setVolume(20);
        basicRemoteForJioTV.turnOff();
    }
}

