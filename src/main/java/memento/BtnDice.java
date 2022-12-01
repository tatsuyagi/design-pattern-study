package memento;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import common.Command;

class BtnDice extends JButton implements Command {
  Mediator med;

  BtnDice(ActionListener al, Mediator m) {
    super("Throw Dice");
    addActionListener(al);
    med = m;
    med.registerDice(this);
  }

  public void execute() {
    med.throwit();
  }
}
