/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :
 *****************************************************************************/

public class EkkiInt {
    public static void main(String[] args) {
        try {
            int tala = Integer.parseInt(args[0]);
            System.out.println("input var : " + tala);
        }
        catch (NumberFormatException e) {
            System.out.println(" input Verður að vera heiltala");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("input empty");
            return;

        }

        int a = Integer.parseInt(args[0]);
        if (a >= 10)
            System.out.print("winner");
        else
            System.out.print("looser");

    }
}
