package mediator;

import javax.swing.JButton;

import common.Command;

import java.awt.event.ActionListener;

class BtnView extends JButton implements Command {
  Mediator med;

  BtnView(ActionListener al, Mediator m) {
    super("View");
    addActionListener(al);
    med = m;
    med.registerView(this);
  }

  public void execute() {
    med.view();
  }
}
