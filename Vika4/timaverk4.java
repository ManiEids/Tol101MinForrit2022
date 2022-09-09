/******************************************************************************
 *****************************************************************************/

public class timaverk4 {
    public static void main(String[] args) {

        int fyrri = 35;
        int seinni = 129;

        if (fyrri < seinni) {
            int t = fyrri;
            fyrri = seinni;
            seinni = t;
        }
        System.out.println(fyrri);
        System.out.println(seinni);
        
    }
}

