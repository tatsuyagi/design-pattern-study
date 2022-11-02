import facade.FacadeDemo;
import mediator.MediatorDemo;
import memento.MementoDemo;

/**
 * 起動クラス
 * 
 * @since 2022/10/20
 * @author T.Yagi
 */
public class App {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("引数は1つ指定してください");
            System.exit(1);
        }

        switch (args[0]) {
            case "mediator":
                new MediatorDemo();
                break;
            case "facade":
                new FacadeDemo();
                break;
            case "memento":
                new MementoDemo();
                break;
            default:
                System.out.println("正しい引数を指定してください");
                System.exit(1);
        }
    }
}
