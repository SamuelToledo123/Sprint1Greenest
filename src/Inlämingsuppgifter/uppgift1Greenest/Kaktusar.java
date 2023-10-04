package Inlämingsuppgifter.uppgift1Greenest;

// Subklass
public class Kaktusar extends Krukväxter {

    // Konstruktor för kaktusar som tar emot namn och längd
    public Kaktusar(String namn, double längd) {
        super(namn,längd); // Inkaplsing

    }

    @Override
    public double mängdNäringsVätska() {
        return 0.02; // Polymorfism
    }

    @Override
    public String typNäringsVätska() {
        return "Mineralvatten"; // Polymorfism
    }

    @Override
    public String printMe() {
        return  "Info om denna Kaktus: "+ getNamn() + "\n" +
                "Längd: " + getLängd() + "meter" + "\n" +
                "Mängd näringsvätska per dag: " + mängdNäringsVätska()+ "Liter" + "\n" +
                "Typ av näringsvätska: " + typNäringsVätska();
    }
}