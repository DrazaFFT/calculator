package Digitron;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MenuBar {

    JMenuBar createMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int action;
                action = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da izadjete?", "Izlaz", JOptionPane.OK_CANCEL_OPTION);
                if (action == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }

        });
        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int action = JOptionPane.showConfirmDialog(null, " Java Digitron 1.0 \n Univerzitet Metropolitan Beograd \n Fakultet Informacionih Tehnologija \n IT120 Razvoj Aplikacija \n Drazen Jankovic 3471", "Java Digitron", JOptionPane.PLAIN_MESSAGE);

            }
        });

        return menuBar;
    }

}
