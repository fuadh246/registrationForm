import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame frame;
    static JPanel info_panel;
    static JPanel data_panel;
    static JPanel button_panel;
    static JLabel name;
    static JTextArea inName;
    static JTextArea inAge;
    static JLabel age;
    public static void main(String[] args) {
        frame = new JFrame("Window");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        info_panel = new JPanel();
        info_panel.setSize(600,200);
        name = new JLabel("Name\n");
        name.setAlignmentX(3);
        inName = new JTextArea();
        age = new JLabel("Age");

        info_panel.add(name);
        info_panel.add(inName);
        info_panel.add(age);
        info_panel.setVisible(true);

        data_panel = new JPanel();
        data_panel.setVisible(true);

        button_panel = new JPanel();

        frame.add(info_panel);
        frame.add(data_panel);
        frame.add(button_panel);
        frame.setVisible(true);
    }
}