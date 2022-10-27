package facade;

class Driver {
  private Car car;

  Driver(Car car) {
    this.car = car;
  }

  void pushPedal(int speed) {
    this.car.setSpeed(speed);
  }

  void drive(int minutes) {
    this.car.run(minutes);
  }
}
