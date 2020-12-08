import java.util.Scanner;

public class complex {
    public static void main(String[] args){
        int numri_pare_real;
        int numri_pare_imagjinar;
        int numri_dyte_real;
        int numri_dyte_imagjinar;
      while (true) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Vendosni numrin tuaj kompleks te par (numri real i pari pastaj ai imagjinar dhe i ne fund) : ");
          String numri_pare_ = scanner.nextLine();

          System.out.print("Vendosni numrin tuaj kompleks te dyte (numri real i pari pastaj ai imagjinar dhe i ne fund) : ");
          String numri_dyte_ = scanner.nextLine();

          numri_ne_string nr = new numri_ne_string(numri_pare_);
          numri_imagjinar nr_2 = new numri_imagjinar(numri_pare_);

          numri_pare_real = numri_ne_string.numri_pare;
          numri_pare_imagjinar = numri_imagjinar.numri_dyte;


          numri_ne_string nr_3 = new numri_ne_string(numri_dyte_);
          numri_imagjinar nr_4 = new numri_imagjinar(numri_dyte_);

          numri_dyte_real = numri_ne_string.numri_pare;
          numri_dyte_imagjinar = numri_imagjinar.numri_dyte;

          veprime vp = new veprime(numri_pare_real, numri_pare_imagjinar, numri_dyte_real, numri_dyte_imagjinar);
      }

    }
}
