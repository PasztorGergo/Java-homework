package guis;

import java.awt.Color;

import javax.swing.JButton;

public class PassThroughButton extends JButton {
    public PassThroughButton(String text, Color color){
        initialize(text, color);
    }

    private void initialize(String text, Color color){
        setText(text);
        setBorderPainted(false);
        setVisible(true);
        setContentAreaFilled(false);
        setOpaque(false);
        setFocusPainted(false);
        setForeground(color);
    }
}
