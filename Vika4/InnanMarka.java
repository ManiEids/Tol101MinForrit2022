/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :Tekur inn eina heiltölu af skipanalínu.
 *  Skrifar út Innan marka ef talan er stærri
 *  *  eða jafnt og 6 og minna en 60 en annars Utan marka
 *  *  ef talan af skipanalínu er á röngu sniði
 *  þá er prentað Ekki heiltala
 *****************************************************************************/

public class InnanMarka {
    public static void main(String[] args) {


        try {
            int num = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Ekki heiltala");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Ekki heiltala");
            return;
        }

        int tala = Integer.parseInt(args[0]);
        String mark;

        if (tala >= 6 && tala <= 60)
            mark = "Innan marka";
        else
            mark = "Utan marka";


        System.out.println(mark);
    }

}

