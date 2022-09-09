/******************************************************************************
 *  Nafn    : Máni
 *  Lýsing  : Tekur inn radíus kúlu sem kommutölu
 *  af skipanalínu og prentar út rúmmál hennar
 *
 *****************************************************************************/

public class RummalKulu {
    public static void main(String[] args) {

        // taka inn radius kulu( kommutala)
        double r = Double.parseDouble(args[0]);

        // formula rummál kúlu R = ((  4 * pi * r(*3))/3)

        double pi = Math.PI;//pi
        double r2 = Math.pow(r, 3);//radius i 3 veldi
        double rum = ((4 * pi * r2) / 3); //reikna rummal

        System.out.print(rum);

    }
}
