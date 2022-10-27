package mediator;

import javax.swing.JButton;
import java.awt.event.ActionListener;

class BtnBook extends JButton implements Command {
  Mediator med;

  BtnBook(ActionListener al, Mediator m) {
    super("Book");
    addActionListener(al);
    med = m;
    med.registerBook(this);
  }

  public void execute() {
    med.book();
  }
}
