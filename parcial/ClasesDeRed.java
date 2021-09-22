
package Parcial;


public class ClasesDeRed {
    private String Pc1;
    private String Pc2;
    private String Pc3;
    private int A = 3;
    private int B = 5;
    private int C = 7;

    public ClasesDeRed(String PC1, String PC2, String PC3) {
        this.Pc1 = PC1;
        this.Pc2 = PC2;
        this.Pc3 = PC3;
    }

    public String getPC1() {
        return Pc1;
    }

    public String getPC2() {
        return Pc2;
    }

    public String getPC3() {
        return Pc3;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public void setPC1(String PC1) {
        this.Pc1 = PC1;
    }

    public void setPC2(String PC2) {
        this.Pc2 = PC2;
    }

    public void setPC3(String PC3) {
        this.Pc3 = PC3;
    }

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public void setC(int C) {
        this.C = C;
    }
    
 
    public void  isLimitHost(){
        boolean limite;
        if (this.A > 3 ) {
            limite = true;
        } else {
            limite = false ;
        if (this.B > 5){
            limite = true;
        } else {
            limite = false;
                
        if (this.C > 7);
            limite = false;
        }
    }
} 
}

