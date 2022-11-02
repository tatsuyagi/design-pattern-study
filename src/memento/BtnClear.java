package memento;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import common.Command;

class BtnClear extends JButton implements Command {
  Mediator med;
  BtnClear(ActionListener al, Mediator m) {
      super("Clear");
      addActionListener(al);
      med = m;
      med.registerClear(this);
  }
  public void execute() {
     med.clear();
  }
}
