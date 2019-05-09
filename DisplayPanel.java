package Digitron;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DisplayPanel extends JPanel {

    private JTextArea textArea;

    public DisplayPanel() {
        textArea = new JTextArea();
        textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        textArea.setEditable(false);
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
    }

    public String getTextArea() {
        return textArea.getText();
    }

    void setTextArea(String input) {
        textArea.setText(input);
    }

}
