
package modell;


public class BemutatkozikModell {
    private Ember[] emberek;
    private int kor;

    
    public BemutatkozikModell() {
        emberek = new Ember[3];
        emberek[0]=new Ember("Pál","Német, Magyar", 20, true);
        emberek[1]=new Ember("Emese","Magyar, Angol",12,false);
        emberek[2]=new Ember("Barna","Görög", 30, false);
        
    }

    public String kezdes() {
        String s = "\nBemutatkozás: \n";
        int i =1;
        for(Ember ember:emberek){
            String a= ember.getNev();
            String f= ember.getNyelv();
            int d= ember.getSzdatum();
            s+="A nevem "+a+", ilyen nyelveken beszélek: "+f+",korom: "+d+"\n";
            
        }
        return s;
    }


}
