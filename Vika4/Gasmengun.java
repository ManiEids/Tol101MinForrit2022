/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :Tekur inn heiltölu af skipanalínu sem táknar gasmengun
 *  og prentar út Góð ef talan
 *  er á bilinu 0-350 að báðum tölum meðtöldum en
 *  Ekki góð ef talan er stærri en 350.
 *  ef talan er lægri en 0 er prentað út Ólöglegt gildi
 *  Ef sett er inn kommutala eða bókstafir, þ.e. ekki
 * heiltala þá er prentuð út villumelding Ólöglegt snið tölu.
 *****************************************************************************/

public class Gasmengun {
    public static void main(String[] args) {

        try {
            int testgasmengun = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Ólöglegt snið tölu");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ólöglegt snið tölu");
        }

        int gasmengun = Integer.parseInt(args[0]);

        if (gasmengun >= 0 && gasmengun <= 350) {
            System.out.print("Góð");
        }
        else {
            if (gasmengun > 350) {
                System.out.println("Ekki góð");
            }
            else {
                if (gasmengun < 0) {
                    System.out.println("Ólöglegt gildi");
                }

            }
        }
    }
}


