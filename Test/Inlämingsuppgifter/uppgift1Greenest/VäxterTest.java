package Inlämingsuppgifter.uppgift1Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// EnhetsTester

class VäxterTest {

        @Test
        void testPalmMängdNäringsVätska() {

            // 0.5 liter * Längd
            var palm = new Palmer("testPalm", 3);

            assertEquals(1.5, palm.mängdNäringsVätska());


        }

        @Test
        void testPalmTypNäringsVätska() {

            var palm = new Palmer("TestPalm", 5.0);

            assertEquals("Kranvatten", palm.typNäringsVätska());

        }

        @Test
        void testKaktusMängdNäringsVätska() {

            // 0.02 liter per dag oberoende av kaktusens storlek
            var kaktus = new Kaktusar("testKaktus", 10);

            assertEquals(0.02, kaktus.mängdNäringsVätska());


        }

        @Test
        void testKaktusTypNäringsVätska() {

            var kaktus = new Kaktusar("TestKaktus", 0.02);

            assertEquals("Mineralvatten", kaktus.typNäringsVätska());

        }

        @Test
        void testKöttättandeväxterMängdNäringsVätska() {

            // 0.1 liter * (0.2 * längd)
            var köttätandeväxt = new Köttätandeväxter("testKöttätandeväxt", 0.5);

            assertEquals(0.2, köttätandeväxt.mängdNäringsVätska());


        }

        @Test
        void testKöttätandeväxterTypNäringsVätska() {

            var köttätandeväxt = new Köttätandeväxter("TestKöttätandeväxt", 5.0);

            assertEquals("Proteindryck",köttätandeväxt.typNäringsVätska());

        }
    }

