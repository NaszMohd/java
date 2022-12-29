import javax.swing.*;

public class PopUpListExample {
  public static void main(String[] args) {
    // Create a new JFrame
    JFrame frame = new JFrame("Pop-Up List Example");

    // Create a String array of items to display in the pop-up list
    String[] items = {"Item 1", "Item 2", "Item 3"};

    // Create a new JComboBox and add the items to it
    JComboBox<String> comboBox = new JComboBox<>(items);

    // Add the combo box to the frame
    frame.add(comboBox);

    // Set the size and location of the frame
    frame.setSize(200, 100);
    frame.setLocationRelativeTo(null);

    // Show the frame
    frame.setVisible(true);
  }
}