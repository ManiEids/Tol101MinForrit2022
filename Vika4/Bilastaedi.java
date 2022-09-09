/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :Forritið tekur  inn á skipanalínu Bílnúmer,
 *  Gjaldflokkinn,  kls sem bifreið fer inn á stæðið og  kls.
 *  sem biðfreið fer út af stæði. Til einföldunar fer bíll alltaf
 *  út af stæði sama dag og hann fer inn á það. Þið getið reiknað
 *  með að kls sem bifreið fer út af stæði sé stærri en kls sem
 *  bifreið fer inn á stæði. Forritið á að prenta út bílnúmer
 *  og  gjald (heiltala) sem er rukkað.
 *****************************************************************************/

public class Bilastaedi {
    public static void main(String[] args) {

        //String bilnr = args[0];
        String bilnr = args[0];
        char gjaldf = args[1].charAt(0);
        int pen = 0;
        switch (gjaldf) {
            case 'A':
                pen = 450;
            case 'B':
                pen = 600;
            case 'U':
                pen = 750;
            case 'W':
                pen = 900;
                System.out.println("Þú náðir!");
                break;
            case 'F':
                System.out.println("Þú féllst");
                break;
            default:
                System.out.println("Ólögleg einkunn");
        }
        System.out.println(bilnr);
        System.out.println(pen);
    }
}

