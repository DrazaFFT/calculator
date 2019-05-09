package Digitron;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class EqualsPanel extends JPanel {

    private JButton equalsButton;
    private NumbersPanel numbersPanel;
    private DisplayPanel displayPanel;
    private OperationsPanel operationsPanel;
    private String operation, numberDisplay, displayResult;
    private Double firstNumber, secondNumber, result;

    public EqualsPanel(DisplayPanel displayPanel, OperationsPanel operationsPanel) {
        this.displayPanel = displayPanel;
        this.operationsPanel = operationsPanel;
        setLayout(new BorderLayout());
        equalsButton = new JButton("=");
        add(equalsButton, BorderLayout.CENTER);

        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = operationsPanel.getEnteredNumber();
                operation = operationsPanel.getOperation();
                numberDisplay = displayPanel.getTextArea();

                //izbegavanje greske praznog stringa
                if ((numberDisplay != null && !numberDisplay.isEmpty()) && (operation != null && !operation.isEmpty())) {
                    secondNumber = Double.parseDouble(numberDisplay);
                    switch (operation) {
                        case "+":
                            result = firstNumber + secondNumber;
                            displayResult = Double.toString(result);
                            displayPanel.setTextArea(displayResult);
                            break;
                        case "-":
                            result = firstNumber - secondNumber;
                            displayResult = Double.toString(result);
                            displayPanel.setTextArea(displayResult);
                            break;
                        case "*":
                            result = firstNumber * secondNumber;
                            displayResult = Double.toString(result);
                            displayPanel.setTextArea(displayResult);
                            break;
                        case "/":
                            if (secondNumber != 0) {
                                result = firstNumber / secondNumber;
                                displayResult = Double.toString(result);
                                displayPanel.setTextArea(displayResult);
                            } else {
                                displayPanel.setTextArea("0");
                            }
                            break;
                    }
                } else {
                    displayPanel.setTextArea("0");
                }

            }

        });
    }

}
