/******************************************************************************
 *  Nafn    : Kári Einarsson
 *  T-póstur: kae44@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Flatarmal {
    public static void main(String[] args) {

        double breidd = Double.parseDouble(args[0]);
        double haed = Double.parseDouble(args[1]);

        System.out.println(breidd * haed);


    }
}
