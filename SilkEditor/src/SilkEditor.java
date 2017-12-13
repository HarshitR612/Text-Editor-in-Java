/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import silk.editorGraphics;


/**
 *
 * @author Harshit
 */
public class SilkEditor extends JTextPane {

    public final static String NAME = "Silk Text Editor";
    public static void main(String[] args) throws BadLocationException {
        editorGraphics g = new editorGraphics();
        g.setVisible(true);
    }
}