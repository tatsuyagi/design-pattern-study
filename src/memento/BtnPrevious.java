package memento;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import common.Command;

class BtnPrevious extends JButton implements Command {
  Mediator med;

  BtnPrevious(ActionListener al, Mediator m) {
    super("Previous");
    addActionListener(al);
    med = m;
    med.registerPrevious(this);
  }

  public void execute() {
    med.previous();
  }
}