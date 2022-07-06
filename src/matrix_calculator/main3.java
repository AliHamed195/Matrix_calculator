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
public class main3 {

    public static void main(String[] args) {
        Vectors i = new Vectors();
        //C:\Users\HP\AppData\Local\SceneBuilder
        // solutions k = new solutions();
        //double[][] a = {{1, 3, 0}, {2, 4, 0}, {2, 0, 1}};
        double[] x = {3, 2, 1};
        double[] b = {9, 14, 7};
        // a= i.Rref(a);
        // b=i.Vmult(i.invers(a), b);

        // i.Voutput(i.Vmult(i.invers(a), b));
        //double []z=i.XSolution(a, b);
        //i.Voutput(z);
      //  i.Voutput(i.XSolution(a, b));
        //System.out.println(Math.random());
        i.output(i.add(x, b));
        i.output(i.sub(x, b));
        System.out.println(i.product(x, b));
    }

}
