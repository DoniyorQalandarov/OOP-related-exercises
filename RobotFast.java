package leetCodeExamples.oopLearn;

public class RobotFast {
    public void run() {
        System.out.println(" can running");
    }
}

class RobotExcellent extends RobotFast {
    public void speak() {
        System.out.println(" can speaking");
    }
}

class RobotSun extends RobotExcellent {
    public void play() {
        System.out.println(" can dancing");
    }
}

class RobotsTest {
    public static void main(String[] args) {
        System.out.println("RobotFast ability");
        RobotFast fast = new RobotFast();
        fast.run();
        System.out.println("\nRobotExcellent ability");
        RobotExcellent excellent = new RobotExcellent();
        fast.run();
        excellent.speak();
        RobotSun sun = new RobotSun();
        System.out.println("\nRobotSun ability");
        sun.run();
        sun.speak();
        sun.play();
    }
}
