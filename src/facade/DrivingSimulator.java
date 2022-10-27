package facade;

public class DrivingSimulator {
  public void simulate() {
    Car c = new Car();
    Driver d = new Driver(c);
    d.pushPedal(700);
    d.drive(30);
    d.pushPedal(750);
    d.drive(20);
    System.out.println("The travel distance is " + c.getDistance() + " m.");
  }
}
