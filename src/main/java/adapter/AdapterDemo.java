package adapter;

/**
 * Adapter(アダプター)パターンのエントリポイント.
 * 
 * @see {@link https://ja.wikipedia.org/wiki/Adapter_パターン}
 */
public class AdapterDemo {

  public AdapterDemo() {

    System.out.println("継承パターン");
    InheritanceTarget target1 = new InheritanceAdapter();
    target1.targetMethod1();
    target1.targetMethod2();

    System.out.println("移譲パターン");
    TransferTarget target2 = new TransferAdapter();
    target2.targetMethod1();
    target2.targetMethod2();

  }

}
