/******************************************************************************
 *  Nafn    : Máni
 *  Lýsing; Les inn kommutölu,
 *  k, setur kvaðratrót af k í annað
 *  veldi og setur í breytuna utkoma,
 *  prentar út utkoma og röksegðina  utkoma > k
 *  dæmi
 *  %java ErStaerra 2.0
 * 2.0000000000000004
 * true
 *
 * %java ErStaerra 16.0
 * 16.0
 * false
 *****************************************************************************/

public class ErStaerra {
    public static void main(String[] args) {
        double k = Double.parseDouble(args[0]);
        double ksqr = Math.sqrt(k);
        double utkoma = Math.pow(ksqr, 2);

        System.out.println(utkoma);

        boolean roksegd = (utkoma > k);
        System.out.print(roksegd);

    }
}
