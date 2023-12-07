package oop;

public class Computer {
    private Ram ram;

    public Computer(Ram ram) {
        this.ram = ram;
    }
    public void printStatement(){
        System.out.println("Computer ram: "+ram.getValue());
    }
}
