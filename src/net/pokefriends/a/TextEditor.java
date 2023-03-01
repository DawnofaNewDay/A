package net.pokefriends.a;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import com.formdev.flatlaf.*;

public class TextEditor {

    public JFrame frame;
    public JTextArea text;

    public boolean wordwrap = true;

    TextEditor() {
        // Making sure the window stays dark on Mac
        System.setProperty("apple.awt.application.appearance", "system");

        // Look and feel of FlatLaf darcula, it's just to look pretty
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to change look and feel!");
            System.exit(-1);
        }

        // Frame & Textbox options
        frame = new JFrame();
        text = new JTextArea();

        frame.setSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        text.setLineWrap(true);
        text.setBorder(BorderFactory.createCompoundBorder(text.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        // Go!
        frame.add(text);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        TextEditor window = new TextEditor();
    }
}