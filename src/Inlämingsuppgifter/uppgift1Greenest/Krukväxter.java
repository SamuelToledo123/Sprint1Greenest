package Inlämingsuppgifter.uppgift1Greenest;


// Super Klass
public abstract class Krukväxter implements Växter {

    //  privata instansvariabler för namn och längd
    private String namn;
    private double längd;

    // Konstruktor för krukväxter som tar emot namn och längd som argument
    public Krukväxter(String namn, double längd){
        this.namn = namn;
        this.längd = längd;
    }

    // Inkaplsing
    public String getNamn() {
        return namn;



    }

    // Inkapsling
    public double getLängd() {
        return längd;

    }
}

