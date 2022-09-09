/******************************************************************************
 *  Nafn    : Máni   -- Mail : mfe5(at)hi.is
 * Lýsing á verkefni:
 * Skrifið klasann Hradi sem hefur main fall sem les inn af skipanalínu
 * tvær heiltölur, hraða á kls, reiknar út meðalhraða og prentar út.
 * Prentar einnig út true ef meðalhraði er minni eða jafnt og 50
 *
 *****************************************************************************/

public class Hradi {
    public static void main(String[] args) {
        float a = Integer.parseInt(args[0]);
        float b = Integer.parseInt(args[1]);

        float med = ((a + b) / 2);
        System.out.print(med + " ");

        boolean speed;
        speed = (med <= 50);
        System.out.println(speed);

    }
}
