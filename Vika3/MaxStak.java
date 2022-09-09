/******************************************************************************
 *  Nafn    : Máni
 *  Lýsing  :Tekur inn þrjár heiltölur af skipanalínu og prentar út stærstu
 *  heiltöluna
 *
 *****************************************************************************/

public class MaxStak {
    public static void main(String[] args) {
        //taka inn 3 heiltölur
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //finna hæsta gildi af 3 heiltölum

        int max = Math.max(a, (Math.max(b, c)));

        //prenta max

        System.out.print(max);


    }
}
