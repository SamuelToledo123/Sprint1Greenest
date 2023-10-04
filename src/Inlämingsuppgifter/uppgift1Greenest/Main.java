package Inlämingsuppgifter.uppgift1Greenest;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // objekt där det skapas instanser av olika växttyper och tilldelar dem variabler
        Växter igge = new Kaktusar("igge", 0.02);
        Växter laura = new Palmer("laura", 5);
        Växter meatloaf = new Köttätandeväxter("meatloaf", 0.7);
        Växter olof = new Palmer("olof", 1);

        String växtensNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få mat? Ange växtens namn: ");

        try {

            Växter valdPlanta = null;

                switch (NamnPåVäxter.valueOf(växtensNamn.toUpperCase())) {
                    case IGGE:
                        valdPlanta = igge;
                        break;
                    case LAURA:
                        valdPlanta = laura;
                        break;
                    case MEATLOAF:
                        valdPlanta = meatloaf;
                        break;
                    case OLOF:
                        valdPlanta = olof;
                        break;
                }

            JOptionPane.showMessageDialog(null, valdPlanta.printMe());

        // Hanterar undantag om ett ogiltigt växtnamn anges
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,"Tyvärr namnet " + växtensNamn + " hittades inte i systemet");
            JOptionPane.showMessageDialog(null,"Greenest namnlista:\n" + NamnPåVäxter.IGGE + "\n" + NamnPåVäxter.LAURA
                    + "\n" + NamnPåVäxter.MEATLOAF + "\n" + NamnPåVäxter.OLOF);
        // Hanterar undantag om användaren stänger av programmet
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Du har stängt av programmet");

        }
    }
}




