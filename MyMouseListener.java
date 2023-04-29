import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class MyMouseListener extends MouseAdapter {

    @Override
    public void mouseEntered(MouseEvent e) {
        Component component = e.getComponent();
        if(component.getName() == "rightComponentSubmitButton"){
            JFrame frame = (JFrame) SwingUtilities.getRoot(component);
            frame.getContentPane().setCursor(new Cursor(Cursor.HAND_CURSOR));
            Component[] components = frame.getContentPane().getComponents();

            for (Component componentt : components) {
                if(componentt.getClass().getName() == "MainContainer"){
                    JPanel panel = (JPanel) componentt;
                    Component[] componentss = panel.getComponents();
                    for(Component cmp: componentss){
                        System.out.println(cmp.getClass().getName());
                    }
                }
            }
        }

        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Component component = e.getComponent();
        if (component.getName() == "rightComponentSubmitButton") {
            JFrame frame = (JFrame) SwingUtilities.getRoot(component);
            
            frame.getContentPane().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        }
    }

    @Override
    public void mouseClicked(MouseEvent e){
        Component component = e.getComponent();
        if (component.getName() == "rightComponentSubmitButton") {
            System.out.println("yo");
        }
    }



}
