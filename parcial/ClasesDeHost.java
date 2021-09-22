
package Parcial;

public class ClasesDeHost {
      private int A;
      private int B;
      private int C;
      private int D;
    public ClasesDeHost(int A, int B, int C, int D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }
    public static void configurar(int A, int B, int C, int D){
    
    }
    public boolean conectar(ClasesDeRed red){
        return false;
    }
    public static void ping (ClasesDeHost host, String msg){
    }
    public static void ping (String msg){
    }
}
