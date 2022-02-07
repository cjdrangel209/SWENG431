package lab4part3;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import javax.swing.JTextField;

/**
 *
 * @author Cory Drangel
 */
class MyAWTEventListener implements AWTEventListener{

    @Override
    public void eventDispatched(AWTEvent event) {
        Object o = event.getSource();
        //event.getID();
        if (o instanceof JTextField){
            JTextField jtf = (JTextField)o;
            jtf.setText("99999999");
        }
    }
    
}
