package adapter;

/**
 * 継承アダプター
 */
public class InheritanceAdapter extends Adaptee implements InheritanceTarget {

  @Override
  public void targetMethod1() {
    method1();
  }

  @Override
  public void targetMethod2() {
    method2();
  }
  

}
