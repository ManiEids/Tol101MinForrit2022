/******************************************************************************
 *Máni Eiðsson - mfe5@hi.is
 * lýsing á verkefni
 * Forritið tekur inn tvær heiltölur af skipanlínu,
 * byrjunarhæð í metrum og lokahæð í metrum og reiknar út hækkun
 * (lokahæð - byrjunarhæð) og prentar út á staðalúttak.
 *
 *****************************************************************************/

public class Haekkun {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); /*byrjunarhæð = a */
        int b = Integer.parseInt(args[1]); /* lokahæð = b */
        int sum = b - a;
        
        System.out.println(sum);

    }
}
