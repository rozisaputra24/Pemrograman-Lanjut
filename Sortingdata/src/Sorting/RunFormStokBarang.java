package Sorting;

import javax.swing.*;

public class RunFormStokBarang {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/icon.png");
        JFrame jFrame = new JFrame("Sokeraya Outdoor");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new FormStokBarang().getRootPanel());
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
    }
}
