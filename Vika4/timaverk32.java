/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :
 *****************************************************************************/

public class timaverk32 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double num = Double.parseDouble(args[2]);

        if (num >= 0.0) {

            b = a;
            System.out.println("Sqrt is " + Math.sqrt(num));
        }

    }
}
