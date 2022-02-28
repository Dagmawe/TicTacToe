/**
 * @author Dagmawe Legesse
 * @Description Sets 'x' and 'o' to the proper box when pressed
 */
package TicTacToeDemo;
import java.awt.event.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class TicTacButtonListener implements ActionListener{
    public static Boolean s_State = true;
    @Override
    public void actionPerformed(ActionEvent arg0) {
        TicTacToeButton tButton = (TicTacToeButton) arg0.getSource();
        if (TicTacButtonListener.s_State) {
            tButton.setIconImage('x');
            tButton.setXOVal('x');
        }
        else {
            tButton.setIconImage('o');
            tButton.setXOVal('o');
        }
        tButton.setState(true);
        //check the results
        int gameCondition = TicTacToeSolver.solveGame(tButton.getParent().getButtons());
        if(gameCondition == 1) {
            int valueOfWinner;
            if(TicTacButtonListener.s_State)
                valueOfWinner =1;
            else
                valueOfWinner = -1;
            tButton.getParent().updateWins(valueOfWinner);
            int clearStatus = JOptionPane.showConfirmDialog(null, " The Game has been won \n Would you Like to Play Again?", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
                if (clearStatus == JOptionPane.YES_OPTION) {
                    tButton.getParent().resetBoard();
                }
                else {
                    System.exit(0);
                }

        }
        else if ( gameCondition == -1) {
            int clearStatus = JOptionPane.showConfirmDialog(null, " The Game is a Draw \n Would you Like to Play Again?","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
                if ( clearStatus == JOptionPane.YES_OPTION) {
                    tButton.getParent().resetBoard();
                }
                else {
                    System.exit(0);
                }
        }
        TicTacButtonListener.s_State = !TicTacButtonListener.s_State;
        
    }
    
}