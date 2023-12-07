package oop;

public class Main {
    public static void main(String[] args) {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(10);
        Computer computer = new Computer(ram,ssd);
        computer.printStatement();

        TimeClass timeClass1 = new TimeClass(4500);
        TimeClass timeClass2 = new TimeClass(4,67,8);

        timeClass1.printResult();
        timeClass2.printResult();

        TimeClass timeClass3 = timeClass1.sum(timeClass2);
        timeClass3.printResult();

        System.out.println(timeClass1.secondsInInterval());
        System.out.println(timeClass2.secondsInInterval());
    }
}
