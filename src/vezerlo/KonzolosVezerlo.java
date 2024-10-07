
package vezerlo;

import modell.BemutatkozikModell;
import nezet.KonzolNezet;

public class KonzolosVezerlo {
       private BemutatkozikModell modell;
    private KonzolNezet nezet;

    public KonzolosVezerlo(BemutatkozikModell modell, KonzolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
    
        start(nezet, modell);
    }

    private void start(KonzolNezet nezet, BemutatkozikModell modell1) {
        nezet.megjelenit(modell1.kezdes());

    }
}
