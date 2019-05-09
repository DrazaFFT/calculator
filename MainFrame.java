package Digitron;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    private CalcPanel calcPanel;
    private MenuBar menuBar;

    public MainFrame() {
        super("Java Digitron");
        setLayout(new BorderLayout());
        calcPanel = new CalcPanel();
        menuBar = new MenuBar();
        setJMenuBar(menuBar.createMenuBar());

        add(calcPanel, BorderLayout.CENTER);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
