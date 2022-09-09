/******************************************************************************
 *  Nafn    : Sæunn Elín Ragnarsdóttir
 *  T-póstur: ser9@hi.is
 *
 *  Lýsing  : Forritið les inn tvær heiltölur, hraði á kls., reiknar út
 *           meðalhraða (kommutala) og prentar út. Prentar einnig út true ef
 *           meðalhraði er minni eða jafnt og 50. Prentar annars út false.
 *
 *****************************************************************************/

public class Hradi {
    public static void main(String[] args) {
        int hradi1 = Integer.parseInt(args[0]);
        int hradi2 = Integer.parseInt(args[1]);
        double medalhradi = (hradi1 + hradi2) / 2.0;
        System.out.print(medalhradi + " ");
        System.out.println(medalhradi <= 50);
    }
}
