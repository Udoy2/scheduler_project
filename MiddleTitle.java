import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiddleTitle extends JPanel {
    MiddleTitle() {
        // label
        JLabel title = new JLabel("Select Your Prefered Courses");
        title.setFont(new Font("Open sans", Font.BOLD, 28));
        title.setForeground(new Color(85, 84 ,84));
        
        this.add(title);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        this.setBackground(Color.white);
        this.setSize(900, 111);
        this.setLocation(0,74);

    }
}
