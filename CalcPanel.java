package Digitron;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcPanel extends JPanel {

    private DisplayPanel display;
    private NumbersPanel numbersPanel;
    private EqualsPanel equalsPanel;
    private OperationsPanel operationsPanel;

    public CalcPanel() {

        display = new DisplayPanel();
        numbersPanel = new NumbersPanel(display);
        operationsPanel = new OperationsPanel(display, numbersPanel);
        equalsPanel = new EqualsPanel(display, operationsPanel);
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        //////ekran digitrona////display///
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(5, 5, 5, 5);
        add(display, gc);

        ///////operacije///operations/////
        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(5, 5, 5, 5);
        add(operationsPanel, gc);

        ///// brojevi digitrona/// numbers///
        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(5, 5, 5, 5);
        add(numbersPanel, gc);

        ///jednako//////equals//////////////
        gc.gridx = 0;
        gc.gridy = 3;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(5, 5, 5, 5);
        add(equalsPanel, gc);

    }
}
