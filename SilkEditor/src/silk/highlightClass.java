/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silk;


import javax.swing.text.*;
import java.awt.*;

/**
 *
 * @author Harshit
 */

public class highlightClass extends DefaultHighlighter.DefaultHighlightPainter{

    public highlightClass(Color color) {
        super(color);
    }

    public void highLight(JTextComponent textComp, String[] pattern) {
        removeHighlights(textComp);

        try {
            Highlighter hr = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            for (int i = 0; i < pattern.length; i++) {
                int pos = 0;

                while ((pos = text.indexOf(pattern[i], pos)) >= 0) {
                    hr.addHighlight(pos, pos + pattern[i].length(), this);
                    pos += pattern[i].length();
                }
            }
        } catch (BadLocationException e) {}

    }

    public void removeHighlights(JTextComponent textComp) {

        Highlighter hr = textComp.getHighlighter();
        Highlighter.Highlight[] hls = hr.getHighlights();

        for (int i = 0; i < hls.length; i++) {
            if (hls[i].getPainter() instanceof highlightClass) {
                hr.removeHighlight(hls[i]);
            }
        }
    }
}
