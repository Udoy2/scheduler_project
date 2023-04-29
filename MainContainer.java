import java.awt.Color;
import javax.swing.JPanel;

public class MainContainer extends JPanel {

    MainContainer(){
        // left side container will be here
        LeftContainer leftcontainer = new LeftContainer();
        this.add(leftcontainer);
        // right side container will be here
        RightContainer rightcontainer = new RightContainer();
        this.add(rightcontainer);

        // panel information setting
        this.setSize(900, 439);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setLocation(0, 74 + 111);
    }


}
