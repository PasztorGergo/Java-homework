package main;
import javax.swing.SwingUtilities;

import guis.ApplicationFrame;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new ApplicationFrame();
            }
        });
    }
}