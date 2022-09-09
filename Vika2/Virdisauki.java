/******************************************************************************
 *eiknar út virðisaukaskatt af gefinni
 * upphæð og virðisaukaskattsprósentu.
 *****************************************************************************/

public class Virdisauki {
    public static void main(String[] args) {
        double total = Double.parseDouble(args[0]);
        double skatt = Double.parseDouble(args[1]);

        Double skattpros = (skatt / 100);
        double vsk = (total * skattpros);
        System.out.print(vsk);


    }
}
