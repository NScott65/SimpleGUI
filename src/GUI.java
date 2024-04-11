import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private static JLabel label1;
    private static JLabel label2;

    public int math = 0;

    public int count = 0;

    public GUI(){

        JFrame frame = new JFrame("Simple GUI");

        frame.setSize(600, 400);

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(2,2,10,10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //add panel to frame
        frame.add(panel);






        //Create label and add to panel
        label1 = new JLabel("Value: " + math);
        label1.setHorizontalAlignment(JLabel.CENTER);

        label2 = new JLabel("Number of Changes: " + count);
        label2.setHorizontalAlignment(JLabel.CENTER);

        //add label
        panel.add(label1);
        panel.add(label2);

        //Create Buttons
        JButton b1 = new JButton("+1");
        JButton b2 = new JButton("-1");
        b1.setVerticalAlignment(JButton.CENTER);
        b2.setVerticalAlignment(JButton.CENTER);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b1Press();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b2Press();
            }
        });

        //Add buttons to the Panel
        panel.add(b2);
        panel.add(b1);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    public void b1Press(){
        math += 1;
        count++;
        label1.setText("Value: " + math);
        label2.setText("Number of Changes: " + count);
    }

    public void b2Press(){
        math -= 1;
        count++;
        label1.setText("Value: " + math);
        label2.setText("Number of Changes: " + count);
    }
}
