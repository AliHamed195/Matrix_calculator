package matrix_calculator;

public class basic_Mopp {

    basic_Mopp() {
    }

    public String output(double[][] a1) {
        String s="";
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
               s+= a1[i][j] + "\t";
            }
            s+="\n";
        }
        return s;
    }

    // addition
    public double[][] add(double[][] m1, double[][] m2) {
        double[][] A = new double[m1.length][m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                A[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return A;
    }

    // subtract
    public double[][] sub(double[][] m1, double[][] m2) {
        double[][] A = new double[m1.length][m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                A[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return A;
    }

    // for the normal multiplication (two matrices without any conditions)
    public double[][] mult(double[][] m1, double[][] m2) {
        double[][] A = new double[m1.length][m1.length];
        double z = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                for (int l = 0; l < m1.length; l++) {
                    z += m1[i][l] * m2[l][j];
                }
                A[i][j] = z;
                z = 0;
            }
        }
        return A;
    }

    //Identity maker
    public static double[][] I(double a[][]) {
        double[][] I = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            I[i][i] = 1;
        }
        return I;
    }
}
