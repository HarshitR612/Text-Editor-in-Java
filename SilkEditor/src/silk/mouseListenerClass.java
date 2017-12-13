/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silk;


import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author Harshit
 */
public class mouseListenerClass extends JPanel 
                                  implements MouseMotionListener {
    //...in initialization code:
    //Keeps a track of mouse events on blank area or panel
    JTextArea ta; 
    public mouseListenerClass(JTextArea ta)
            {
                this.ta = ta;
               
            }
        

    @Override
    public void mouseDragged(MouseEvent e) {
        saySomething("Mouse dragged", e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       saySomething("Mouse moved", e);
    }

    private void saySomething(String mouse_dragged, MouseEvent e) {
        ta.setText("x:"+e.getX()+"\n"+"y:"+e.getY());
    }
        
       
    }




