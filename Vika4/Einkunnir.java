/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :
 *****************************************************************************/

public class Einkunnir {
    public static void main(String[] args) {
        int eink = Integer.parseInt(args[0]);
        String stafur;
        if (eink == 9 || eink == 10)
            stafur = "A";
        else if (eink == 8)
            stafur = "B";
        else if (eink == 7)
            stafur = "C";
        else if (eink == 6)
            stafur = "D";
        else
            stafur = "F";
        System.out.println(stafur);
    }
}
