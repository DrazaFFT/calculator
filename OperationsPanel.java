package Digitron;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

class OperationsPanel extends JPanel {

    private JButton[] operationButton;
    private String[] opButtonNames;
    private DisplayPanel displayPanel;
    private String operation;
    private NumbersPanel numbersPanel;
    private double result, enteredNumber;

    OperationsPanel(DisplayPanel displayPanel, NumbersPanel numbersPanel) {
        this.displayPanel = displayPanel;
        this.numbersPanel = numbersPanel;

        setLayout(new GridLayout(2, 3, 10, 10));
        setBorder(BorderFactory.createEtchedBorder());
        String[] opButtonNames = {"+", "-", "*", "/", "SQRT", "C"};
        operationButton = new JButton[opButtonNames.length];

        for (int i = 0; i < opButtonNames.length; i++) {
            operationButton[i] = new JButton(opButtonNames[i]);
            add(operationButton[i]);
        }
        operationButton[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clicked = (JButton) e.getSource();
                String panelText = displayPanel.getTextArea();
                displayPanel.setTextArea("");
            }
        });
        operationButton[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String panelText = displayPanel.getTextArea();
                if (panelText != null && !panelText.isEmpty()) {
                    enteredNumber = Double.parseDouble(panelText);
                }
                displayPanel.setTextArea("");
                operation = "+";
                System.out.println(enteredNumber);
            }
        });
        operationButton[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String panelText = displayPanel.getTextArea();
                if (panelText != null && !panelText.isEmpty()) {
                    enteredNumber = Double.parseDouble(panelText);
                }
                displayPanel.setTextArea("");
                operation = "-";
                System.out.println(enteredNumber);
            }
        });
        operationButton[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String panelText = displayPanel.getTextArea();
                if (panelText != null && !panelText.isEmpty()) {
                    enteredNumber = Double.parseDouble(panelText);
                }
                displayPanel.setTextArea("");
                operation = "*";
                System.out.println(enteredNumber);
            }
        });
        operationButton[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String panelText = displayPanel.getTextArea();
                if (panelText != null && !panelText.isEmpty()) {
                    enteredNumber = Double.parseDouble(panelText);
                }
                displayPanel.setTextArea("");
                operation = "/";
                System.out.println(enteredNumber);
            }
        });
        operationButton[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String panelText = displayPanel.getTextArea();
                if (panelText != null && !panelText.isEmpty()) {
                    enteredNumber = Math.sqrt(Double.parseDouble(panelText));
                }
                panelText = Double.toString(enteredNumber);
                displayPanel.setTextArea(panelText);

            }
        });
    }

    public double getEnteredNumber() {
        return enteredNumber;
    }

    public String getOperation() {
        return operation;
    }

}
