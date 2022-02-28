/**
 * @author Dagmawe Legesse
 * @Description Checks for win in all directions 
 */



package TicTacToeDemo;

public class TicTacToeSolver {
    public static int solveGame( TicTacToeButton[][] buttonGroup) {
        boolean moreButtons = false;
        if (((buttonGroup[0][0].getState() && buttonGroup[0][1].getState() && buttonGroup[0][2].getState())
                && (buttonGroup[0][0].equals(buttonGroup[0][1]) && buttonGroup[0][1].equals(buttonGroup[0][2])))
                || ((buttonGroup[1][0].getState() && buttonGroup[1][1].getState() && buttonGroup[1][2].getState())
                        && (buttonGroup[1][0].equals(buttonGroup[1][1]) && buttonGroup[1][1].equals(buttonGroup[1][2])))
                || ((buttonGroup[2][0].getState() && buttonGroup[2][1].getState() && buttonGroup[2][2].getState()))
                        && (buttonGroup[2][0].equals(buttonGroup[2][1]) && buttonGroup[2][1].equals(buttonGroup[2][2]))) {
            return 1;
        }

        if (((buttonGroup[0][0].getState() && buttonGroup[1][0].getState() && buttonGroup[2][0].getState())
                && (buttonGroup[0][0].equals(buttonGroup[1][0]) && buttonGroup[1][0].equals(buttonGroup[2][0])))
                || ((buttonGroup[0][1].getState() && buttonGroup[1][1].getState() && buttonGroup[2][1].getState())
                        && (buttonGroup[0][1].equals(buttonGroup[1][1]) && buttonGroup[1][1].equals(buttonGroup[2][1])))
                || ((buttonGroup[0][2].getState() && buttonGroup[1][2].getState() && buttonGroup[2][2].getState()))
                        && (buttonGroup[0][2].equals(buttonGroup[1][2]) && buttonGroup[1][2].equals(buttonGroup[2][2]))) {
            return 1;
        }

        if (((buttonGroup[0][0].getState() && buttonGroup[1][1].getState() && buttonGroup[2][2].getState())
                && (buttonGroup[0][0].equals(buttonGroup[1][1]) && buttonGroup[1][1].equals(buttonGroup[2][2])))
                || ((buttonGroup[0][2].getState() && buttonGroup[1][1].getState() && buttonGroup[2][0].getState())
                        && (buttonGroup[0][2].equals(buttonGroup[1][1]) && buttonGroup[1][1].equals(buttonGroup[2][0])))) {
            return 1;
        }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if ( buttonGroup[i][j].getState() == false)
                    moreButtons = true;
        if (moreButtons)
            return 0;
        else
            return -1;           
    }
}

