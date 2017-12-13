/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silk;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Harshit
 */


public class getCurrentPosition extends Thread{
        JTextArea textArea;
        JFrame frame;
    public getCurrentPosition(JFrame frame,JTextArea textArea)
    {
        this.frame= frame;
        this.textArea = textArea;
    }
    public void run()
    {
        while(true)
        {
            Rectangle r = frame.getBounds();
            int h = r.height;
            int w = r.width;
            textArea.setBounds(w-150,h-180,100,40);
    
        }
    }
}
