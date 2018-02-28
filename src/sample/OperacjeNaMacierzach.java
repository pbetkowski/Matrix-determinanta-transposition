package sample;

import sample.interfejs.Obliczenia;

public class OperacjeNaMacierzach implements Obliczenia {

    int wyznacznik;

    @Override
    public int wyznacznik2x2(int[][] macierz2x2)
    {
        wyznacznik = (macierz2x2[0][0] * macierz2x2[1][1]) - (macierz2x2[1][0] * macierz2x2[0][1]);
        return wyznacznik;
    }

    @Override
    public int wyznacznik3x3(int[][] macierz3x3)
    {
        wyznacznik = (macierz3x3[0][0] * macierz3x3[1][1] * macierz3x3[2][2]
                         + macierz3x3[0][1] * macierz3x3[1][2] * macierz3x3[2][0]
                         + macierz3x3[0][2] * macierz3x3[1][0] * macierz3x3[2][1])
                         - (macierz3x3[0][2] * macierz3x3[1][1] * macierz3x3[2][0]
                         + macierz3x3[0][0] * macierz3x3[1][2] * macierz3x3[2][1]
                         + macierz3x3[0][1] * macierz3x3[1][0] * macierz3x3[2][2]);
        return wyznacznik;
    }

}
