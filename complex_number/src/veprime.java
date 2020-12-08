import java.util.Scanner;

public class veprime {
    public static int numri_real;
    public static int numri_imagjinar;
    public static int numri_dyte_real;
    public static int numri_dyte_imagjinar;

    veprime(int numri_real,int numri_imagjinar,int numri_dyte_real, int numri_dyte_imagjinar){
        veprime.numri_real = numri_real;
        veprime.numri_imagjinar = numri_imagjinar;
        veprime.numri_dyte_real = numri_dyte_real;
        veprime.numri_dyte_imagjinar = numri_dyte_imagjinar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cfare veprimi do qe te ndodhi tani? (1)mbledhje / (2) zbritja / (3)nxjerrja kufizave ne formatin(a,b)");
        int veprimi = scanner.nextByte();

        if(veprimi == 1 ){
            int numri = numri_real + numri_dyte_real;
            int numri_imag = numri_imagjinar + numri_dyte_imagjinar;

            System.out.println("Mbledhje ktyre numrave kompleks do na japi: "+ numri+ "+" + Integer.toString(numri_imag)+"i" );
        }else if (veprimi == 2){
            int numri = numri_real - numri_dyte_real;
            int numri_imag = numri_imagjinar - numri_dyte_imagjinar;

            if(numri_imag>0){
                System.out.println("Zbritja ktyre numrave kompleks do na japi: "+ numri + "+" + Integer.toString(numri_imag)+"i" );
            }else {
                System.out.println("Zbritja ktyre numrave kompleks do na japi: " + numri + "" + Integer.toString(numri_imag) + "i");
            }
        }else if(veprimi==3){
            System.out.println("Numri pare: ("+ numri_real + "," + numri_imagjinar+")");
            System.out.println("Numri pare: ("+ numri_dyte_real + "," + numri_dyte_imagjinar + ")");
        }
    }
}
