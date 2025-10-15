import java.util.Random;

public class Main {
    public static void main(String[] args){
        int [] w = new int[9];
        for (int i = 0; i < 9; i++){
            w[i] = 4 + i*2;
        }
        double [] x = new double[14];
        Random random = new Random();
        for (int j = 0; j < 14; j++){
            x[j] = -12.0 + random.nextDouble() * (11.0 - (-12.0));
        }
        double [][] s = new double[9][14];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 14; j++){
                double X = x[j];
                if (w[i] == 4){
                    s[i][j] = Math.sin(Math.atan(Math.pow((X-0.5)/23,2)));
                }
                else if (w[i] == 6 || w[i] == 8 || w[i] == 14 || w[i] == 18){
                    s[i][j] = Math.exp(Math.tan(Math.sin(X)));
                }
                else {
                    s[i][j] = Math.sin(Math.sin(Math.pow((4 *(0.25 + Math.atan((X-0.5)/23))), 3)));
                }
            }
        }
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 14; j++){
                System.out.printf("%10.5f", s[i][j]);
            }
            System.out.println();
        }
    }
}