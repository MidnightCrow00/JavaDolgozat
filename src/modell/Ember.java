
package modell;


public class Ember {
    private String nev, nyelv;
    private int kor;
    private boolean szulinap;


    public String getNev() {
        return nev;
    }

    public String getNyelv() {
        return nyelv;
    }

    public int getKor() {
        if(szulinap==true){
            kor++;
        }
        return kor;
    }

    public Ember(String nev, String nyelv,int szdatum, boolean szulinap) {
        this.nev = nev;
        this.nyelv = nyelv;
        this.kor = szdatum;
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
