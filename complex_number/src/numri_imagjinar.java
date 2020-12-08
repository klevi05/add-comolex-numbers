public class numri_imagjinar {
    public int numri_dyte;

    numri_imagjinar(String numri) {
        if(numri.contains("+")){

            String[] ndarje = numri.split("\\+");

            if (ndarje[1].endsWith("i")) {
                String numri_dyte_real = ndarje[1].substring(0, ndarje[1].length() - 1);
                numri_dyte = Integer.parseInt(numri_dyte_real);
            }} else if (numri.contains("-")){

            //mer nje string dhe e kthen ate si string duke e ndare ne shenjen +

            String[] ndarje = numri.split("-");

            //nese elementi dyte i ksaj liste mbaron me nje i ath vazhdon veprimi

            if (ndarje[1].endsWith("i")) {

                //mer numrin nga lista duke hequr elementin e fundit dhe e kthen ate ne int

                String numri_dyte_real = ndarje[1].substring(0, ndarje[1].length() - 1);
                numri_dyte = Integer.parseInt(numri_dyte_real) * -1;
            }}else {
            System.out.println("Ky nuk eshte numer kompleks!");
        }
    }
}
