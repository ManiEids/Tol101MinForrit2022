/******************************************************************************
 *  Nafn    Máni
 *  Lýsing  : Tekur inn tvær heiltölur, a og b,
 *  af skipanalínu, prentar út samsvarandi
 *  char gildi a og char gildi af a+b
 *  Notkunardæmi
 * %java Stafir 65 2
 * A C
 * %java Stafir 53 5
 * 5 :
 *****************************************************************************/

public class Stafir {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        System.out.print((char) (a));
        System.out.print(" ");
        System.out.print((char) (a + b));

    }
}
