package iterator;

/**
 * Iteratorパターンのエントリポイント.
 * 
 * @see {@link https://ja.wikipedia.org/wiki/Iterator_パターン}
 */
public class IteratorDemo {

  public IteratorDemo() {
    
    Parking parking = new Parking(10);

    parking.appendCar(new Car("プリウス", "White"));
    parking.appendCar(new Car("レクサス", "Black"));
    parking.appendCar(new Car("クラウン", "White"));
    parking.appendCar(new Car("ハリアー", "White"));

    MyIterator iterator = parking.iterator();

    while(iterator.hasNext()) {
      Car car = (Car) iterator.next();
      System.out.println(car);
    }
  }

}
