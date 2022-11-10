package composite;

import java.util.List;

public interface FileInterface {
  public void defaultMethod(int depth);
  public List<FileInterface> getChildren();
  public boolean addComponent(FileInterface c);
  public boolean removeComponent(FileInterface c);
}
