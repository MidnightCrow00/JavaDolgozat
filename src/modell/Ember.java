
package modell;

import java.util.Scanner;


public class Ember {
    private String nev, nyelv;
    private int kor;
    private boolean szulinap;
private static final Scanner sc = new Scanner(System.in);

    public String getNev() {
        return nev;
    }

    public String getNyelv() {
        nyelv = sc.nextLine();
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
