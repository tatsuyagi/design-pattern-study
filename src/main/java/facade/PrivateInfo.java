package facade;

public class PrivateInfo implements Private, Special {
  @Override
  public void accessPrivate() {
    // TODO Auto-generated method stub
  }

  @Override
  public void accessSpecial() {
    // TODO Auto-generated method stub
  }

  @Override
  public void accessGeneral() {
    System.out.println("connect PrivateInfo");
  }
}
