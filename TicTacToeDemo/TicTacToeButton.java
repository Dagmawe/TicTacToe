/**
 * @author Dagmawe Legesse
 * @Description Sets images for 'x' and 'o' and alterantes when pressed 
 */
package TicTacToeDemo;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TicTacToeButton extends JButton {
    ImageIcon m_image;
    TicTacToePanel m_panel;
    boolean m_state = false; // this tells if we are set or not?
    int m_xoValue = 0;
    File fx = new File("/Users/leges/OneDrive/Documents/Projects/TicTacToe/TicTacToeDemo/O.png");
    File fo = new File("/Users/leges/OneDrive/Documents/Projects/TicTacToe/TicTacToeDemo/X.png");

    TicTacToeButton(TicTacToePanel parent) {
        this.addActionListener(new TicTacButtonListener());
        m_panel = parent;
    }

    void setIconImage(char icn) {
        Image ii;
        try {

            if (icn == 'x')
                ii = ImageIO.read(fx);
            else
                ii = ImageIO.read(fo);

            m_image = new ImageIcon(ii);
            setIcon(m_image);
        } catch (IOException ioe) {
            System.out.println("unable to read icon image");
        }
    }

    public TicTacToePanel getParent() {
        return m_panel;
    }

    boolean getState() {
        return m_state;
    }

    void setState(boolean state) {
        m_state = state;
    }

    void setXOVal(char icn) {
        if (icn == 'x')
            m_xoValue = 1;
        else if (icn == 'o')
            m_xoValue = -1;
    }

    int getXOVal() {
        return m_xoValue;
    }

    boolean equals(TicTacToeButton tb) {
        return m_xoValue == tb.getXOVal();
    }

    public void reset() {
        m_state = false;
        setIcon(null);
    }
}