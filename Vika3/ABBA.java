/******************************************************************************
 *  Nafn    : Máni
 *  Lýsing  :Les inn tvær heiltölur aTala og bil af skipanalínu.
 *  Fyrri talan er UnicodeTenglar á ytra svæði.
 *  (ascii) kóðinn fyrir char breytuna a
 *   aTala+bil er Unicode kóðinn fyrir char breytuna b og
 *   aTala+2*bil er Unicode kóðinn fyrir char breytuna c.
 *    Forritið prentar út stafarunu sem lítur svona út
 *    abcba
 *
 *****************************************************************************/

public class ABBA {
    public static void main(String[] args) {

        //tekur  inn tvær heiltölur
        int a = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);
        // gildi fyrir b og c
        int b = (a + bil);
        int c = (a + bil * 2);
        //prenta niðurstöðurls -al ~/.ssh
        System.out.print((char) (a));
        System.out.print((char) (b));
        System.out.print((char) (c));
        System.out.print((char) (b));
        System.out.print((char) (a));

    }
}
