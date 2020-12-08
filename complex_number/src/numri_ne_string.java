public class numri_ne_string {
    public String numri;
    public int numri_pare;

    numri_ne_string(String numri) {
        this.numri = numri;
        //nesee ne stringun qe na vjen permban + kryhen veprimet
        //ne rast te kundert shkon ke linjat me poshte te kodit

        if(numri.contains("+")){

            String[] ndarje = numri.split("\\+");
            numri_pare = Integer.parseInt(ndarje[0]);

        }else if(numri.contains("-")){

            String[] ndarje = numri.split("-");
            numri_pare = Integer.parseInt(ndarje[0]);

        }else {

            System.out.println("Ky nuk eshte nje numer kompleks");

        }
    }
}
