import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
//from w w w .ja  va 2  s.c o  m
public class Main {
  public static void main(String[] args) {
    int bigNumber = 30001;
    String[] bigData = new String[bigNumber];
    for (int ii = 0; ii < bigNumber; ii++) {
      bigData[ii] = "String " + (ii + 1);
    }
    JList list = new JList(bigData);
    list.setVisibleRowCount(5);

    JOptionPane.showMessageDialog(null, new JScrollPane(list));
  }
}