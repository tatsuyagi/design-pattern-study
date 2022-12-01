package adapter;

/**
 * 移譲アダプター
 */
public class TransferAdapter extends TransferTarget {

  private Adaptee adaptee;

  public TransferAdapter() {
    this.adaptee = new Adaptee();
  }

  @Override
  public void targetMethod1() {
    adaptee.method1();
  }

  @Override
  public void targetMethod2() {
    adaptee.method2();
  }
  
}
