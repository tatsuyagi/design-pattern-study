package mediator;

import javax.swing.JLabel;
import java.awt.Font;

class LblDisplay extends JLabel {
  Mediator med;

  LblDisplay(Mediator m) {
    super("Just start...");
    med = m;
    med.registerDisplay(this);
    setFont(new Font("Arial", Font.BOLD, 24));
  }
}
