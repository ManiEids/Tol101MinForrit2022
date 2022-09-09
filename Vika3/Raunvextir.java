/******************************************************************************
 *  Nafn    : Máni Eiðsson
 *  Póstur  : MFE5@hi.is
 *  Lýsing  :Teknar eru inn tvær kommutölur,
 *  nafnvextir og verðbólgustig,
 * Raunvextir eru reiknaðir út og prentaðir
 *****************************************************************************/

public class Raunvextir {
    public static void main(String[] args) {
        //taka inn tvær kommutölur
        double nvx = Double.parseDouble(args[0]);
        double vbs = Double.parseDouble(args[1]);

        //hundraðshlutfall
        double nvx100 = (nvx / 100);
        double vbs100 = (vbs / 100);
        //raunvextir = (((1+nvx)/(1+vbs))-1)
        double raunv = (((1 + nvx100) / (1 + vbs100)) - 1);
        double raunv100 = (raunv * 100);

        //prenta raunvexti
        System.out.print(raunv100);

    }
}
