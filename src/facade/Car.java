package facade;

class Car {
  private int speed;
  private int distance;

  Car() {
    this.speed = 0;
    this.distance = 0;
  }

  void setSpeed(int speed) {
    this.speed = speed;
  }

  void run(int minutes) {
    this.distance += minutes * this.speed;
  }

  int getDistance() {
    return this.distance;
  }
}