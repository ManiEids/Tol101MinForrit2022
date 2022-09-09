/******************************************************************************
 *  Nafn    : Sæunn Elín Ragnarsdóttir
 *  T-póstur: ser9@hi.is
 *
 *  Lýsing  : Forritið tekur inn tvær heiltölur af skipanlínu, byrjunarhæð í
 *            metrum og lokahæð í metrum og reiknar út hækkun
 *            (lokahæð - byrjunarhæð) og prentar út á staðalúttak.
 *
 *****************************************************************************/

public class Haekkun {
    public static void main(String[] args) {
        int byrjunarhaed = Integer.parseInt(args[0]);
        int lokahaed = Integer.parseInt(args[1]);
        int haekkun = lokahaed - byrjunarhaed;
        System.out.println(haekkun);
    }
}

