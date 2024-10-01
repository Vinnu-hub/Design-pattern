package org.example.composite;

public class CompositeTest {

    public static void main(String[] args) {

        // Creating leaf components
        Component hdd = new leaf(4000, "HDD");
        Component mouse = new leaf(3000, "Mouse");
        Component monitor = new leaf(5000, "Monitor");
        Component ram = new leaf(8000, "RAM");
        Component cpu = new leaf(9000, "CPU");

        // Creating composite components
        composite peripherals = new composite("Peripherals");
        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);

        composite cabinet = new composite("Cabinet");
        cabinet.addComponent(hdd);
        cabinet.addComponent(ram);
        cabinet.addComponent(cpu);

        composite computer = new composite("Computer");
        computer.addComponent(cabinet);
        computer.addComponent(peripherals);

        // Displaying details
        peripherals.showprice();

        //Computer.showprice();
        //Cabinet.showprice();

        // like these also we can perform  the operation
    }
}
