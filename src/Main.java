import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame frame;
    static JPanel info_panel;
    static JPanel data_panel;
    static JPanel button_panel;
    static JLabel name;
    static JLabel age;
    public static void main(String[] args) {
        frame = new JFrame("Window");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        info_panel = new JPanel();
//        frame.add(info_panel);
//        name = new JLabel("name");
//        info_panel.add(name);
//        data_panel = new JPanel();
//
//        button_panel = new JPanel();
//        frame.add(name);
//        frame.add(data_panel);
//        frame.add(button_panel);
        frame.setVisible(true);
    }
}