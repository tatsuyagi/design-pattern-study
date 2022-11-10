package composite;

/**
 * Composite(コポジット)パターンのエントリポイント.
 * 
 * @see {@link https://ja.wikipedia.org/wiki/Composite_パターン}
 */
public class CompositeDemo {

  public CompositeDemo() {
    FileInterface root = new Folder("root");
    FileInterface usr = new Folder("usr");
    FileInterface var = new Folder("var");
    FileInterface home = new Folder("home");
    FileInterface user1 = new Folder("user1");
    FileInterface file1 = new File("file1");

    root.addComponent(usr);
    usr.addComponent(var);
    root.addComponent(home);
    home.addComponent(user1);
    user1.addComponent(file1);
    root.defaultMethod(0);
  }

}
