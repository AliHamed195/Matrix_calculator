
package matrix_calculator;


public class Vectors {
    
    Vectors(){}
    
    public double [] add(double [] a,double [] b){
        double [] answer = new double [a.length];
        for (int i = 0; i < a.length; i++) {
            answer[i]=a[i]+b[i];
        }
        return answer;
    }
    public double [] sub(double [] a,double [] b){
        double [] answer = new double [a.length];
        for (int i = 0; i < a.length; i++) {
            answer[i]=a[i]-b[i];
        }
        return answer;
    }
    public double product(double [] a,double [] b){
        double answer=0;
        for (int i = 0; i < a.length; i++) {
            answer+=a[i]*b[i];
        }
        return answer;
    }
    public String output(double [] a){
         String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + "\n";
        }
        return s;
    }
}
