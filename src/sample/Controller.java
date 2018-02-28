package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;


public class Controller extends TworzenieMacierzy{

    @FXML Label a11;
    @FXML Label a12;
    @FXML Label a13;
    @FXML Label a14;
    @FXML Label a21;
    @FXML Label a22;
    @FXML Label a23;
    @FXML Label a24;
    @FXML Label a31;
    @FXML Label a32;
    @FXML Label a33;
    @FXML Label a34;
    @FXML Label a41;
    @FXML Label a42;
    @FXML Label a43;
    @FXML Label a44;
    Label [] [] macierz2x2;
    Label [] [] macierz3x3;
    int [] [] macierzInt2x2 = new int[2][2];
    int [] [] macierzInt3x3 = new int[3][3];
    @FXML Button b1;
    @FXML Button b2;

    OperacjeNaMacierzach operacjeNaMacierzach = new OperacjeNaMacierzach();
    @FXML Label wynik;

    @FXML MenuItem m1;
    @FXML MenuItem m2;

    public void initialize()
    {
        m1.setDisable(true);
        m2.setDisable(true);
        b1.setDisable(true);
        b2.setDisable(true);
    }



    public void utwórzMacierz2x2()
    {
        wyczyscMacierz();
        macierz2x2 = tablicaLabel2na2();
        wypelnijMacierz2na2(macierz2x2, macierzInt2x2);
        m1.setDisable(false);
        m2.setDisable(true);
        b1.setDisable(false);
        b2.setDisable(true);
        wynik.setText("");
    }

    public void utwórzMacierz3x3()
    {
        wyczyscMacierz();
        macierz3x3= tablicaLabel3na3();
        wypelnijMacierz3na3(macierz3x3, macierzInt3x3);
        m1.setDisable(true);
        m2.setDisable(false);
        b1.setDisable(true);
        b2.setDisable(false);
        wynik.setText("");
    }
    private Label [] [] tablicaLabel2na2()
    {
        Label [] [] macierz2x2 = new Label[2][2];
        macierz2x2[0][0]= a11;
        macierz2x2[0][1]= a12;
        macierz2x2[1][0]= a21;
        macierz2x2[1][1]= a22;
        return macierz2x2;
    }

    private Label [] [] tablicaLabel3na3()
    {
        Label [] [] macierz3x3 = new Label[3][3];
        macierz3x3[0][0]= a11;
        macierz3x3[0][1]= a12;
        macierz3x3[0][2]= a13;
        macierz3x3[1][0]= a21;
        macierz3x3[1][1]= a22;
        macierz3x3[1][2]= a23;
        macierz3x3[2][0]= a31;
        macierz3x3[2][1]= a32;
        macierz3x3[2][2]= a33;
        return macierz3x3;
    }



    public void wyczyscMacierz()
    {
        macierz3x3 = tablicaLabel3na3();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                macierz3x3[i][j].setText("");
            }
        }
    }

    public void wyznacznik2x2()
    {
        wynik.setText(String.valueOf(operacjeNaMacierzach.wyznacznik2x2(macierzInt2x2)));
    }

    public void wyznacznik3x3()
    {
        wynik.setText(String.valueOf(operacjeNaMacierzach.wyznacznik3x3(macierzInt3x3)));
    }


    public void transponuj2x2()
    {
       macierz2x2[0][0].setText(String.valueOf(macierzInt2x2[0][0]));
       macierz2x2[0][1].setText(String.valueOf(macierzInt2x2[1][0]));
       macierz2x2[1][0].setText(String.valueOf(macierzInt2x2[0][1]));
       macierz2x2[1][1].setText(String.valueOf(macierzInt2x2[1][1]));
       macierzInt2x2[0][0] = Integer.valueOf(macierz2x2[0][0].getText().toString());
       macierzInt2x2[0][1] = Integer.valueOf(macierz2x2[0][1].getText().toString());
       macierzInt2x2[1][0] = Integer.valueOf(macierz2x2[1][0].getText().toString());
       macierzInt2x2[1][1] = Integer.valueOf(macierz2x2[1][1].getText().toString());
    }

    public void transponuj3x3()
    {
        macierz3x3[0][0].setText(String.valueOf(macierzInt3x3[0][0]));
        macierz3x3[0][1].setText(String.valueOf(macierzInt3x3[1][0]));
        macierz3x3[0][2].setText(String.valueOf(macierzInt3x3[2][0]));
        macierz3x3[1][0].setText(String.valueOf(macierzInt3x3[0][1]));
        macierz3x3[1][1].setText(String.valueOf(macierzInt3x3[1][1]));
        macierz3x3[1][2].setText(String.valueOf(macierzInt3x3[2][1]));
        macierz3x3[2][0].setText(String.valueOf(macierzInt3x3[0][2]));
        macierz3x3[2][1].setText(String.valueOf(macierzInt3x3[1][2]));
        macierz3x3[2][2].setText(String.valueOf(macierzInt3x3[2][2]));

        macierzInt3x3[0][0] = Integer.valueOf(macierz3x3[0][0].getText().toString());
        macierzInt3x3[0][1] = Integer.valueOf(macierz3x3[0][1].getText().toString());
        macierzInt3x3[0][2] = Integer.valueOf(macierz3x3[0][2].getText().toString());
        macierzInt3x3[1][0] = Integer.valueOf(macierz3x3[1][0].getText().toString());
        macierzInt3x3[1][1] = Integer.valueOf(macierz3x3[1][1].getText().toString());
        macierzInt3x3[1][2] = Integer.valueOf(macierz3x3[1][2].getText().toString());
        macierzInt3x3[2][0] = Integer.valueOf(macierz3x3[2][0].getText().toString());
        macierzInt3x3[2][1] = Integer.valueOf(macierz3x3[2][1].getText().toString());
        macierzInt3x3[2][2] = Integer.valueOf(macierz3x3[2][2].getText().toString());

    }

}
