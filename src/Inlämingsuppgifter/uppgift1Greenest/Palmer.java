package Inlämingsuppgifter.uppgift1Greenest;

// Subklass
public class Palmer extends Krukväxter{

    // Konstruktor för palmer som tar emot namn och längd
    public Palmer(String namn, double längd) {
        super(namn,längd); // Inkapsling

    }


    @Override
    public double mängdNäringsVätska() {
        return 0.5 * getLängd(); // Polymorfism
    }

    @Override
    public String typNäringsVätska() {
        return "Kranvatten"; // Polymorfism
    }

    @Override
    public String printMe() {
        return  "Info om denna Palm: " + getNamn() + "\n" +
                "Längd: " + getLängd() + "meter" + "\n" +
                "Mängd näringsvätska per dag: " + mängdNäringsVätska()+ "Liter" + "\n" +
                "Typ av näringsvätska: " + typNäringsVätska();
    }
}


