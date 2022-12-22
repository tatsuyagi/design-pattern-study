package iterator;

public class ParkingIterator implements MyIterator {
  private Parking parking;
  private int index;

  public ParkingIterator(Parking parking) {
    this.parking = parking;
    this.index = 0;
  }

  public boolean hasNext() {
    if (index < parking.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  public Object next() {
    Car car = parking.getCarAt(index);
    index++;
    return car;
  }
}
