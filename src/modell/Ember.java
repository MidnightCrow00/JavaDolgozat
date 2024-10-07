
package modell;


public class Ember {
    private String nev, nyelv;
    private int szdatum;
    private boolean szulinap;


    public String getNev() {
        return nev;
    }

    public String getNyelv() {
        return nyelv;
    }

    public int getSzdatum() {
        if(szulinap==true){
            szdatum++;
        }
        return szdatum;
    }

    public Ember(String nev, String nyelv,int szdatum, boolean szulinap) {
        this.nev = nev;
        this.nyelv = nyelv;
        this.szdatum = szdatum;
        this.szulinap = szulinap;
    }

   public boolean isSzulinap() {
        return szulinap;
    }

    public void szulinapVan(){
        szulinap = true;
    }
    public void szulinapNincs(){
        szulinap = false;
    }
}
