package facade;

import java.util.Scanner;

/**
 * Facade(ファサード)パターンのエントリポイント.
 * 
 * @see {@link https://ja.wikipedia.org/wiki/Facade_パターン}
 */
public class FacadeDemo {

  private final DrivingSimulator simulator = new DrivingSimulator();

  public FacadeDemo() {

    // DrivingSimulatorがFacadeとなり、インターフェース(simulate)を提供
    simulator.simulate();

    System.out.print("入力してください[general, special, private]: ");
    try (Scanner scanner = new Scanner(System.in);) {
      String mode = scanner.nextLine();

      Connection connection = new Connection();
      General gen = connection.connect(mode);
      gen.accessGeneral();
    } catch (Exception e) {
      System.err.println("処理中にエラーが発生しました");
    }

  }

}
