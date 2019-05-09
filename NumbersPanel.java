package Digitron;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NumbersPanel extends JPanel {

    private JButton[] numButton;
    private String[] numButtonNames;
    private double enteredNumber;
    private String enteredString;
    DisplayPanel displayPanel;

    public double getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(double enteredNumber) {
        this.enteredNumber = enteredNumber;
    }

    public NumbersPanel(DisplayPanel displayPanel) {
        this.displayPanel = displayPanel;
        setLayout(new GridLayout(4, 3, 10, 10));
        setBorder(BorderFactory.createEtchedBorder());
        String[] numButtonNames = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0"};
        numButton = new JButton[numButtonNames.length];
        for (int i = 0; i < numButtonNames.length; i++) {
            numButton[i] = new JButton(numButtonNames[i]);
            add(numButton[i]);
            numButton[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton clicked = (JButton) e.getSource();
                    String panelText = displayPanel.getTextArea();
                    String input = clicked.getText();
                    enteredString = panelText + input;
                    displayPanel.setTextArea(panelText + input);
                }
            });

        }
    }
}
