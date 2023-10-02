import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TextFieldListExample {
    // Declaring the List as a class member
    private static final List<JTextField> textFieldList = new ArrayList<>();

    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("TextField List Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a JPanel
        JPanel panel = new JPanel();

        // Creating and adding JTextField to the List
        JTextField textField1 = new JTextField(20);
        JTextField textField2 = new JTextField(20);
        textFieldList.add(textField1);
        textFieldList.add(textField2);

        // Creating a JButton to print the contents of JTextFields
        JButton printButton = new JButton("Print TextFields");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Iterating through the list and printing the text from JTextFields
                for (JTextField textField : textFieldList) {
                    System.out.println(textField.getText());
                }
            }
        });

        // Adding components to the panel
        panel.add(textField1);
        panel.add(textField2);
        panel.add(printButton);

        // Adding the panel to the frame
        frame.getContentPane().add(panel);

        // Setting frame properties
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
