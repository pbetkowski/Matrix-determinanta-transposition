package sample;

import javafx.scene.control.Label;
import javax.swing.*;


public class TworzenieMacierzy {


    public void wypelnijMacierz3na3(Label [][] labelTable, int intTable [][]) {

        try {
            String str = JOptionPane.showInputDialog("Wprowadź 9 liczb oddzielonych przecinkami.");
            String[] wartosciWStringu = str.split(",");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    intTable[i][j] = Integer.parseInt(wartosciWStringu[i * 3 + j].toString());
                    labelTable[i][j].setText(String.valueOf(intTable[i][j]));
                }
            }
            }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Wprowadź poprawne dane. " +
                    "Prawidłowy ciąg to 9 znaków liczb oddzielonych przecinkami. Np. 1,2,3,4,5,6,7,8,9");
        }
    }


    public void wypelnijMacierz2na2(Label [][] labelTable, int intTable [][]) {

        try {
            String str = JOptionPane.showInputDialog("Wprowadź 4 liczby oddzielone przecinkami.");
            String[] wartosciWStringu = str.split(",");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    intTable[i][j] = Integer.parseInt(wartosciWStringu[i * 2 + j].toString());
                    labelTable[i][j].setText(String.valueOf(intTable[i][j]));
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Wprowadź poprawne dane. " +
                    "Prawidłowy ciąg to 4  liczb oddzielonych przecinkami. Np. 1,2,3,4");
        }
    }

}


