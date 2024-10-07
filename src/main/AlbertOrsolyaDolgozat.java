
package main;

import modell.BemutatkozikModell;
import nezet.KonzolNezet;
import vezerlo.KonzolosVezerlo;


public class AlbertOrsolyaDolgozat {

    
    public static void main(String[] args) {
        BemutatkozikModell modell = new BemutatkozikModell();
        KonzolNezet nezet  = new KonzolNezet();
        new KonzolosVezerlo(modell,nezet);
    }
    
}

