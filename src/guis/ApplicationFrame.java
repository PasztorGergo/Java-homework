package guis;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame{
    public ApplicationFrame(){
        initialize();
    }

    private void initialize(){
        setSize(960, 540);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Expense Tracker");

        addGuiComponents();
    }

    private void addGuiComponents(){
        //Menu sidebar
        JPanel sidePanel = new JPanel();
        sidePanel.setBounds(0, 0, 320, 540);
        sidePanel.setVisible(true);
        sidePanel.setBackground(new Color(0x01B1D6));
        sidePanel.setBorder(BorderFactory.createMatteBorder(0,0,0,4,new Color(0x003551)));
        add(sidePanel);

        //Menu buttons
        PassThroughButton importBtn = new PassThroughButton("Import", new Color(0xffffff));
        sidePanel.add(importBtn);
    }
}