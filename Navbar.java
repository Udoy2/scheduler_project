import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Navbar extends JPanel{
    Navbar(){
        // label
        JLabel title = new JLabel("Dashboard");
        title.setFont(new Font("Open sans", Font.BOLD, 24));
        title.setForeground(new Color(255, 255, 255));
        this.add(title);
        this.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
        this.setSize(900, 74);
        this.setOpaque(true);
        this.setBackground(new Color(3,78,161));
    }
}
