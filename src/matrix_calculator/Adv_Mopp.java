package matrix_calculator;

import java.util.ArrayList;

public class Adv_Mopp extends basic_Mopp {

    private int a;

    private ArrayList<double[][]> Es = new ArrayList<double[][]>();

    Adv_Mopp() {
    }

    public Adv_Mopp(int a) {
        this.a = a;
    }

    public double[][] invers(double[][] a) {
        normal(Eup(Edown(a)));
        double[][] inve = I(a);
        for (int i = this.Es.size() - 1; i >= 0; i--) {
            inve = mult(inve, this.Es.get(i));
        }
        return inve;
    }

    public double[][] Rref(double[][] a) {
        return normal(Eup(Edown(a)));
    }

    public double[][] Edown(double[][] a) {
        double factor = 0;
        int column, row;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a[i].length; j++) {
                if (a[i][i] != 0 && a[j][i] != 0) {
                    factor = (a[j][i] / a[i][i]);
                    column = i;
                    row = j;
                    a = emult(a, factor, row, column);
                } else {
                    continue;
                }
            }
        }

        return a;
    }

    public double[][] Eup(double[][] a) {
        double factor = 0;
        int column, row;
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i][i] != 0 && a[j][i] != 0) {
                    factor = (a[j][i] / a[i][i]);
                    column = i;
                    row = j;
                    a = emult(a, factor, row, column);
                } else {
                    continue;
                }
            }
        }

        return a;
    }

    public double[][] freeColumns(double a[][]) {
        int counter = 0;
        double[][] rref = Rref(a);
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < rref.length; i++) {
            if (rref[i - counter][i] == 0) {
                counter++;
                index.add(i);
            }
        }

        double[][] freecol = new double[a.length][counter];
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < a[i].length; j++) {
                freecol[j][i] = a[j][index.get(i)];
            }
        }
        return freecol;
    }

    public double[][] normal(double a[][]) {
        double[][] e = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] != 0) {
                e[i][i] = 1 / a[i][i];

                a[i][i] = a[i][i] / a[i][i];
            } else {
                continue;
            }
        }
        Es.add(e);

        return a;
    }

    public double[][] emult(double[][] a, double factor, int row, int column) {
        double[][] E = I(a);
        E[row][column] = factor * (-1);
        Es.add(E);
        a = mult(E, a);

        return a;
    }

//    public double[][] shift(double[][] a) {
//        double[][] A = new double[a.length][a.length];
//        int[] numberofX = new int[a.length];
//        int[] index = new int[a.length];
//        int[] x = new int[a.length];
//        int count = 0;
//
//        // to count the number of X in each row
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a[i][j] != 0) {
//                    count++;
//                }
//                numberofX[i] = count;
//                count = 0;
//                index[i] = i;
//            }
//        }
//
//        // to sort the rows which one should be first
//        int numberofXtemp;
//        int indextemp;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j < a[i].length; j++) {
//                if (numberofX[i] < numberofX[j]) {
//                    numberofXtemp = numberofX[i];
//                    numberofX[i] = numberofX[j];
//                    numberofX[j] = numberofXtemp;
//                    indextemp = index[i];
//                    index[i] = j;
//                    index[j] = indextemp;
//                }
//            }
//        }
//
//        // to sort the two dimensional array
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                A[i][j] = a[index[i]][j];
//            }
//        }
//
//        // to return the new array to the original array
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                a[i][j] = A[i][j];
//            }
//        }
//        return a;
//    }
}
