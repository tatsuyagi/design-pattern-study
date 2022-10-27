package mediator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Mediator(メディエーター)パターンのエントリポイント.
 * 
 * @see {@link https://ja.wikipedia.org/wiki/Mediator_パターン}
 */
public class MediatorDemo extends JFrame implements ActionListener {
  Mediator med = new Mediator();

  public MediatorDemo() {
    JPanel p = new JPanel();
    p.add(new BtnView(this, med));
    p.add(new BtnBook(this, med));
    p.add(new BtnSearch(this, med));
    getContentPane().add(new LblDisplay(med), "North");
    getContentPane().add(p, "South");
    setSize(400, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    Command comd = (Command) ae.getSource();
    comd.execute();
  }

}