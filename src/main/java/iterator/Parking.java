package iterator;

public class Parking implements Aggregate {
  private Car[] cars;

  private int last = 0;

  public Parking(int maxsize) {
    this.cars = new Car[maxsize];
  }

  public Car getCarAt(int index) {
    return cars[index];
  }

  public void appendCar(Car car) {
    this.cars[last] = car;
    last++;
  }

  public int getLength() {
    return last;
  }

  public MyIterator iterator() {
    return new ParkingIterator(this);
  }
}
