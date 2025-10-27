public class Main {
    public static double f1 (double k1) {
        return Math.sin(Math.atan(Math.pow((k1-0.5)/23,2)));
    }
    public static double f2 (double k2) {
        return Math.exp(Math.tan(Math.sin(k2)));
    }
    public static double f3 (double k3) {
        return Math.sin(Math.sin(Math.pow((4 *(0.25 + Math.atan((k3-0.5)/23))), 3)));
    }
    public static void f4(double[][] z){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 14; j++){
                    System.out.printf("%-10.5f | ", z[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int [] w = new int[9];
        for (int i = 0; i < 9; i++){
            w[i] = 4 + i*2;
        }
        double [] x = new double[14];
        for (int j = 0; j < 14; j++){
            x[j] = -12.0 + Math.random() * (11.0 - (-12.0));
        }
        double [][] s = new double[9][14];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 14; j++){
                double X = x[j];
                if (w[i] == 4){
                    s[i][j] = f1(X);
                }
                else if (w[i] == 6 || w[i] == 8 || w[i] == 14 || w[i] == 18){
                    s[i][j] = f2(X);
                }
                else {
                    s[i][j] = f3(X);
                }
            }
        }
    f4(s);
    }
}
