/******************************************************************************
 *  Nafn    : Máni
 *  T-póstur: mfe5(at)hi.is
 *
 *  Lýsing  :Forritið les inn tvær kommutölur,
 *  breidd og hæð og reiknar út flatarmál
 *  rétthyrnings og prentar út.
 *****************************************************************************/

public class Flatarmal {
    public static void main(String[] args) {
        float b = Float.parseFloat(args[0]);
        float h = Float.parseFloat(args[1]);

        float fm = (b * h);
        System.out.print(fm);
    }
}
