package lab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class soccer extends JFrame {
    JTextField win1 = new JTextField(20);
    JTextArea win2 = new JTextArea();
    Font tex = new Font("Times new roman", Font.BOLD, 28);
    JButton bt1 = new JButton("Real Madrid");
    JButton bt2 = new JButton("AC_MIlan");
    JLabel lb1 = new JLabel("Result: 0 x 0 ");
    JLabel lb2 = new JLabel("Last Scorer: N/A");
    Label lb3 = new Label("Winner: DRAW");
    int RealMadrid = 0;
    int AC_Milan = 0;

    soccer() {
        super(".......Футбольчик.....");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        setLayout(new FlowLayout());
        setSize(500, 150);
        setVisible(true);
//add(win1);
//win1.setFont(tex);
        add(bt1);
        add(bt2);
        add(lb1);
        add(lb2);
        add(lb3);
//win2.setFont(tex);

/* if (AC_Milan > RealMadrid)
lb3.setText("Winner: AC_Milan");
else
lb3.setText("Winner: Real Madrid");
*/
        bt2.addActionListener(ae -> {
            AC_Milan++;
            lb2.setText("Last Scorer: AC_Milan");
            lb1.setText("Result " + RealMadrid + " x " + AC_Milan);
            if (AC_Milan > RealMadrid) {
                lb3.setText("Winner: AC_Milan");
            }
            else if (AC_Milan == RealMadrid) {
                lb3.setText("----НИЧЬЯ----");
            }
            else
                lb3.setText("Winner: Real Madrid");
        });
        bt1.addActionListener(ae ->
        {
            RealMadrid++;
            lb2.setText("Last Scorer: Real Madrid");
            lb1.setText("Result " + RealMadrid + " x " + AC_Milan);
            if (AC_Milan > RealMadrid) {
                lb3.setText("Winner: AC_Milan");
            }
            else if (AC_Milan == RealMadrid) {
                lb3.setText("НИЧЬЯ");
            }
            else
                lb3.setText("Winner: Real Madrid");
        });

//lb1.setText("Result -" + RealMadrid + " x " + AC_Milan);
    }

    ;


    public static void main(String[] args) {
        new soccer();
    }
}