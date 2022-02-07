
package lab4part3;

import gui.MyGUI;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;

/**
 *
 * @author Cory Drangel
 */
public class Lab4Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        MyAWTEventListener listener = new MyAWTEventListener();
        tk.addAWTEventListener(listener, AWTEvent.MOUSE_EVENT_MASK);
        MyGUI gui = new MyGUI();
        gui.setSize(500, 400);
        gui.setVisible(true);
    }
    
}
