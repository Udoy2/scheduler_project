import java.awt.Color;


import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    MyFrame(){
        Navbar navbar = new Navbar();
        MiddleTitle middletitle = new MiddleTitle();
        MainContainer mainDiv = new MainContainer();
        
        MyMouseListener myMouseListener = new MyMouseListener();
        
        this.addMouseListener(myMouseListener);
        this.add(mainDiv);
        this.add(middletitle);
        this.add(navbar);

        this.setSize(900,600);
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dashboard panel");
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

    }


}
