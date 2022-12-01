package facade;

public class Connection {

  public General connect(String user) throws Exception {
    switch (user) {
      case "general":
        return new GeneralInfo();
      case "special":
        return new SpecialInfo();
      case "private":
        return new PrivateInfo();
      default:
        throw new IllegalArgumentException();
    }
  }
}
