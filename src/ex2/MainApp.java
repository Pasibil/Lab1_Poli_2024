package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String numFis = "in.txt";

        BufferedReader flux_in;
        //flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(numFis)));
        flux_in = new BufferedReader(new FileReader(numFis));

        String linie;
        int num, count = 0;
        int sum = 0, valMin = Integer.MAX_VALUE, valMax = Integer.MIN_VALUE;
        float medArithmetical;

        while((linie = flux_in.readLine()) != null){
            count++;
            num = Integer.parseInt(linie);
            sum = sum + num;
            if(num < valMin){
                valMin = num;
            }
            if(num > valMax){
                valMax = num;
            }
        }
        medArithmetical = (float) sum / count;

        System.out.println("Suma = " + sum);
        System.out.println("Media aritmetica = " + medArithmetical);
        System.out.println("Valoarea minima = " + valMin);
        System.out.println("Valoarea maxima = " + valMax);
    }
}
