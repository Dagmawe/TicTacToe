/**
 * @author Dagmawe Legesse 
 * @Description Keeps track of each players wins during the game 
 */

package TicTacToeDemo;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToeScorePanel extends JPanel {
    TicTacToeFrame s_parent;
    private JTextField m_scoreString;
    public TicTacToeScorePanel(TicTacToeFrame ticTacToeFrame) {
        s_parent = ticTacToeFrame;
        m_scoreString = new JTextField();
        this.add(m_scoreString);
    }

    public void setScoreString (int xScore, int oScore) {
        StringBuilder sb = new StringBuilder();
        sb.append("Player X count is " + xScore + " wins; ");
        sb.append("Player O count is " + oScore + " wins");
        m_scoreString.setText(sb.toString());
    }

    public void clearScore() {
        m_scoreString.setText("");
    }
    
}
