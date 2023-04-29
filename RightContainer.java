import java.awt.Color;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class RightContainer extends JPanel {
    JLabel submitButton;


    RightContainer() {
        MyMouseListener myMouseListener = new MyMouseListener();
        // border declaration
        Border greyBorder = BorderFactory.createLineBorder(new Color(221, 222, 222), 1, true);
        // text areas for information
        JTextField t1 = new JTextField("Start Time");
        t1.setBorder(greyBorder);
        t1.setBorder(BorderFactory.createCompoundBorder(t1.getBorder(),
                BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        t1.setFont(new Font("Open sans", Font.BOLD, 13));
        t1.setForeground(new Color(84, 84, 84));
        t1.setBounds(15, 20, 230, 36);
        this.add(t1);

        // text areas for information
        JTextField t2 = new JTextField("End Time");
        t2.setBorder(greyBorder);
        t2.setBorder(BorderFactory.createCompoundBorder(t2.getBorder(),
                BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        t2.setFont(new Font("Open sans", Font.BOLD, 13));
        t2.setForeground(new Color(84, 84, 84));
        t2.setBounds(15, 20 + 36 + 30, 230, 36);
        this.add(t2);

        // button information will be added here
        ImageIcon submitButtonIcon = new ImageIcon("submit.png");
        submitButton = new JLabel(submitButtonIcon);
        submitButton.setBounds(45, t2.getY() + t2.getHeight() + 40, 167, 41);
        submitButton.setName("rightComponentSubmitButton");
        submitButton.addMouseListener(myMouseListener);
        this.add(submitButton);

        this.setBounds(608, 0, 258, 421);
        this.setOpaque(true);
        this.setBackground(new Color(245, 247, 249));
        this.setBorder(greyBorder);
        this.setLayout(null);
    }



}
