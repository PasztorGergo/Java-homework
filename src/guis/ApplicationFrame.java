package guis;

import javax.swing.JFrame;

public class ApplicationFrame extends JFrame{
    private int width = 960;
    private int height = 540;
    private String title = "Expense Tracker";

    public ApplicationFrame(){
        initialize();
    }

    private void initialize(){
        setSize(width, height);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(title);

        addGuiComponents();
    }

    private void addGuiComponents(){

    }
}