/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :Tekur inn tvær heiltölur af skipanalínu.
 *  *  Skrifar út textann : "Báðar jákvæðar" : ef
 *  *  báðar eru jákvæðar,: "Önnur  jákvæð": eða :"Hvorug jákvæð":
 *****************************************************************************/

public class Positive2 {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("fyrri tala er ekki heiltala");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ekkert input fyrir fyrri tölu");
        }

        try {
            int b = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e) {
            System.out.println("seinni tala er ekki heiltala");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ekkert input fyrir seinni tölu");
        }
        int tala1 = Integer.parseInt(args[0]);
        int tala2 = Integer.parseInt(args[1]);

        if (tala1 > 0 && tala2 > 0) {
            System.out.print("Báðar jákvæðar");
        }
        else {
            if (tala1 > 0 || tala2 > 0) {
                System.out.print("Önnur jákvæð");
            }
            else {
                if (tala1 < 0 && tala2 < 0) {
                    System.out.print("Hvorug jákvæð");
                }
                else {
                    if (tala1 == 0 && tala2 == 0) {
                        System.out.print("Báðar eru 0");
                    }
                }
            }

        }


    }
}


