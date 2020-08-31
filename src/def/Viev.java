package def;

import javax.swing.*;
import java.awt.*;

public class Viev {
    public static void go(){
        JFrame frame = getFrame();
    }





    private static JFrame getFrame(){
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setBounds(500,500,1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);

        return frame;
    }

}
