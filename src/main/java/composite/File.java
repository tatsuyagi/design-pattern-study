package composite;

import java.util.List;

public class File implements FileInterface {
  private String name;

  public File(String name) {
    this.name = name;
  }

  public void defaultMethod(int depth) {
    for (int i = 0; i < depth; i++)
      System.out.print("  ");
    System.out.println("file:" + this.name);
  }

  public List<FileInterface> getChildren() {
    return null;
  }

  public boolean addComponent(FileInterface c) {
    return false;
  }

  public boolean removeComponent(FileInterface c) {
    return false;
  }
}
