/**
 * @author Dagmawe Legesse
 * @Descrption Sets the nine frame to be centered and sized 
 */
package TicTacToeDemo;

import javax.swing.JFrame;
import java.awt.*;

public class TicTacToeFrame extends JFrame{
    
    private static final long serialVersionUID = 1L;
    TicTacToePanel tPanel;
    TicTacToeScorePanel sPanel;
    public TicTacToeFrame (){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());
        tPanel = new TicTacToePanel(this);
        add(tPanel,BorderLayout.CENTER);
        sPanel = new TicTacToeScorePanel(this);
        add(sPanel, BorderLayout.NORTH);
        setVisible(true);
    }
}