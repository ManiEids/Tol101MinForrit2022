/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :Tekur inn heiltölu m/s af skipanalínu og prentar út orðið:
 *  *  Ofsaveður ef talan er stærri en 31, Fárviðri ef hún er 29-31,
 *  *  Rok ef hún er 24-28 og Annað ef talan er minni en 24.
 *  *  Ólöglegt ef heiltalan er minni en 0.
 *****************************************************************************/

public class Vindur {
    public static void main(String[] args) {

        try {
            int testvindur = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Ekki heiltala");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ekkert input");
        }

        int vindur = Integer.parseInt(args[0]);

        if (vindur < 0) {
            System.out.print("Ólöglegt");
        }
        else {
            if (vindur >= 0 && vindur < 24) {
                System.out.println("Annað");
            }
            else {
                if (vindur >= 24 && vindur <= 28) {
                    System.out.println("Rok");
                }
                else {
                    if (vindur >= 29 && vindur <= 31) {
                        System.out.println("Fárviðri");
                    }
                    else {
                        if (vindur > 31) {
                            System.out.println("Ofsaveður");
                        }
                    }
                }
            }
        }
    }
}
