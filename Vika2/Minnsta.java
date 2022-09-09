/******************************************************************************
 *  Nafn    : Máni
 *  Lýsing  : tekur inn 3 heiltölur og finnur minsstu heilt0luna , prentar hana út
 *
 *****************************************************************************/

public class Minnsta {
    public static void main(String[] args) {
        //taka inn 3 heiltölur
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        //finna minnstu tölu
        int min = Math.min(a, Math.min(b, c));

        //prenta minnstu
        System.out.println(min);

    }
}
