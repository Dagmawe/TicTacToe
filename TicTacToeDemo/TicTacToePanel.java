/**
 * @author Dagmawe Legesse 
 * @Description Advises if won or lost 
 */
package TicTacToeDemo;

import javax.lang.model.util.ElementScanner6;
import javax.swing.JPanel;
import java.awt.*;

public class TicTacToePanel extends JPanel {
    TicTacToeButton[][] m_buttons;
    int m_gameCount = 0;
    int m_xGamesWon = 0;
    int m_oGamesWon = 0;
    int m_Gamesdraw = 0;
    TicTacToeFrame m_parent;
    TicTacToePanel (TicTacToeFrame parent){
        m_parent = parent;
        setLayout(new GridLayout(3,3,10,10));
        m_buttons = new TicTacToeButton[3][3];
        for(int i=0;i<3;i++)
            for (int j=0;j<3;j++)
            {
                m_buttons[i][j] = new TicTacToeButton(this);
                add(m_buttons[i][j]);
            }
            m_gameCount++;
    }
    TicTacToeButton[][] getButtons() {
        return m_buttons;
    }

    void resetBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m_buttons[i][j].reset();
        m_gameCount++;        
    }

    public void updateWins (int winner) {
        if (winner == 0)
            return;
        if( winner == 1)
            m_xGamesWon++;
        else
            m_oGamesWon++;
        m_parent.sPanel.setScoreString(m_xGamesWon, m_oGamesWon);
    }
}