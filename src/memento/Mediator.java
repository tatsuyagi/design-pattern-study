package memento;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Mediator {
  BtnDice btnDice;
  BtnPrevious btnPrevious;
  BtnClear btnClear;
  LblDisplay show;
  List<Memento> undo;
  boolean restart = true;
  int counter = 0, ct = 0;

  // ....
  Mediator() {
    undo = new ArrayList<>();
  }

  void registerDice(BtnDice d) {
    btnDice = d;
  }

  void registerClear(BtnClear c) {
    btnClear = c;
  }

  void registerPrevious(BtnPrevious p) {
    p.setEnabled(false);
    btnPrevious = p;
  }

  void registerDisplay(LblDisplay d) {
    show = d;
  }

  void throwit() {
    show.setForeground(Color.black);
    int num = (int) (Math.random() * 6 + 1);
    int i = counter++;
    undo.add(i, new Memento(num));
    show.setText("" + num);
    btnPrevious.setEnabled(true);
  }

  void previous() {
    show.setForeground(Color.red);
    btnDice.setEnabled(false);
    if (undo.size() > 0) {
      ct = undo.size() - 1;
      Memento num = (Memento) undo.get(ct);
      show.setText("" + num.getNum());
      undo.remove(ct);
    } else {
      clear();
    }
  }

  void clear() {
    show.setForeground(Color.black);
    undo = new ArrayList<>();
    counter = 0;
    show.setText("0");
    btnDice.setEnabled(true);
    btnPrevious.setEnabled(false);
  }
}
