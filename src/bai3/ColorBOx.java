package bai3;

import javax.swing.*;
import java.awt.*;

public class ColorBOx extends JFrame {

    public void ColorBOx(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creatAndShow();
        pack();
        setLocation(200,400);
        setVisible(true);
    }
    private void creatAndShow(){
        this.setBackground(Color.red);
    }

    public static void main(String[] args) {
        new ColorBOx();
    }
}
