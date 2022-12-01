package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileInterface {
  private String name;
  private List<FileInterface> fileList = new ArrayList<FileInterface>();

  public Folder(String name) {
    this.name = name;
  }

  public void defaultMethod(int depth) {
    for (int i = 0; i < depth; i++)
      System.out.print("  ");
    System.out.println("folder:" + name);
    for (FileInterface file : fileList) {
      file.defaultMethod(depth + 1);
    }
  }

  public List<FileInterface> getChildren() {
    return this.fileList;
  }

  public boolean addComponent(FileInterface c) {
    return this.fileList.add(c);
  }

  public boolean removeComponent(FileInterface c) {
    return this.fileList.remove(c);
  }
}
