/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  : Tekur inn tvær heiltölur, fyrri og seinni , víxla þeim
 *  ef fyrri er minni en seinni , Prenta fyrri og seinni
 *****************************************************************************/

public class Vixla {
    public static void main(String[] args) {
        int fyrri = Integer.parseInt(args[0]);
        int seinni = Integer.parseInt(args[1]);
        if (fyrri < seinni) {
            int t = fyrri;
            fyrri = seinni;
            seinni = t;
        }
        System.out.println("fyrri er " + fyrri + " seinni er " + seinni);

    }
}
