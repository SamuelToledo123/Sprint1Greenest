package Inlämingsuppgifter.uppgift1Greenest;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Skapar enum variabler för olika växtnamn
        NamnPåVäxter växtIgge = NamnPåVäxter.IGGE;
        NamnPåVäxter växtLaura = NamnPåVäxter.LAURA;
        NamnPåVäxter växtMeatloaf = NamnPåVäxter.MEATLOAF;
        NamnPåVäxter växtOlof = NamnPåVäxter.OLOF;


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
            JOptionPane.showMessageDialog(null,"Namnet du angav " + växtensNamn + " hittades inte i systemet");
            // Lista över alla giltiga namn
            JOptionPane.showMessageDialog(null,"Greenest Namnlista:\n" + växtIgge +"\n" + växtLaura
          + "\n" + växtMeatloaf + "\n" +växtOlof);

        }
    }
}




