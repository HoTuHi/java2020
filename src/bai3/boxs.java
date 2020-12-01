package bai3;

import javax.swing.*;
import java.awt.*;

public class boxs extends JFrame{

    public boxs(){
        creatAndShow();
    }
    private void creatAndShow(){
        setTitle("title");
        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setBackground(Color.red);
//        setLocation(200,400);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new boxs();
    }
}
