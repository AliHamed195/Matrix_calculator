/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_calculator;

/**
 *
 * @author HP
 */
public class solutions extends Adv_Mopp {

    public solutions() {
    }

    public solutions(int a) {
        super(a);
    }

    public double[] BSolution(double[][] a, double[] x) {
        return this.Vmult(a, x);
    }

    public double[] XSolution(double[][] a, double[] b) {
        a = super.invers(a);
        b = this.Vmult(a, b);
        return b;
    }

    public double[] Vmult(double[][] m1, double[] x) {
        double[] b = new double[m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < x.length; j++) {
                b[i] += m1[i][j] * x[j];
            }
        }

        return b;
    }

    public String Voutput(double[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + "\n";
        }
        return s;
    }
}
