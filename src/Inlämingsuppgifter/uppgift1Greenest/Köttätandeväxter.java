package Inlämingsuppgifter.uppgift1Greenest;

// Subklass
public class Köttätandeväxter extends Krukväxter {

    // Konstruktor för köttätandeväxter som tar emot namn och längd
    public Köttätandeväxter(String namn, double längd) {
        super(namn, längd); // Inkapsling

    }

    @Override
    public double mängdNäringsVätska() {
        return 0.1 + (0.2 * getLängd()); // Polymorfism
    }

    @Override
    public String typNäringsVätska() {
        return "Proteindryck"; // Polymorfism
    }

    @Override
    public String printMe() {
        return  "Info om denna Köttätandeväxt: " + getNamn() + "\n" +
                "Längd: " + getLängd() + "meter" + "\n" +
                "Mängd näringsvätska per dag: " + mängdNäringsVätska() + "Liter" + "\n" +
                "Typ av näringsvätska: " + typNäringsVätska();
    }
}
