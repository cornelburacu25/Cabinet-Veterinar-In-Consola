package packageTest;

import org.junit.jupiter.api.Test;
import packageModel.*;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static packageModel.Diagnostic.*;


public class DiagnosticTest {
    @Test
    public void testOferaDiagnostic_ServiciuNedeterminat() {
        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.Nedeterminat);

        Consultatie[] consultatii = new Consultatie[]{c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti", "necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, RACEALA);

        String retetaAsteptata = "Butorphanol - de 1-3 ori pe zi \n" +
                "Paracetamol - o data pe zi \n" +
                "Suplimente de Vitamina C - 3 ori pe zi";
        assertNotEquals(retetaAsteptata, reteta);
    }
    @Test
    public void testOferaDiagnostic_Analize_Nedet() {

        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie consultatii [] = new Consultatie[] {c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti","necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, Nedeterminat);

        assertTrue(reteta.isEmpty());
    }

    @Test
    public void testOferaDiagnostic_Analize_Raceala() {

        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie consultatii [] = new Consultatie[] {c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti","necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, RACEALA);

        String retetaAsteptata = "Butorphanol - de 1-3 ori pe zi \n " +
                "Paracetamol - o data pe zi \n " +
                "Suplimente de Vitamina C - 3 ori pe zi";

        assertEquals(retetaAsteptata, reteta);
    }

    @Test
    public void testOferaDiagnostic_Gastroenterita() {
        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie[] consultatii = new Consultatie[]{c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti", "necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, GASTROENTERITA);
        String retetaAsteptata = "saruri si electroliti - Rehydion, in portii mici \n" +
                "Metoclopramida - 1-3 ori pe zi \n" +
                "Smectita - 1-3 ori pe zi \n" +
                "Bifidobacterium animalis - 2 ori pe zi";

        assertEquals(retetaAsteptata, reteta);
    }
    @Test
    public void testOferaDiagnostic_Paroviroza() {
        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie[] consultatii = new Consultatie[]{c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti", "necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c,PARVOVIROZA);
        String retetaAsteptata = "Soluții izotonice de rehidratare sau soluții Ringer lactat - in portii mici \n" +
                "Soluții electrolitice - o dată pe zi până la mai multe administrări pe zi \n" +
                "Metoclopramida - 1-3 ori pe zi";

        assertEquals(retetaAsteptata, reteta);
    }

    @Test
    public void testOferaDiagnostic_Distemper() {
        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie[] consultatii = new Consultatie[]{c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti", "necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, DISTEMPER);
        String retetaAsteptata = "Soluții izotonice de rehidratare sau soluții Ringer lactat - in portii mici \n" +
                "Doxiciclina - 1-2 ori pe zi \n" +
                "Paracetamol - 1-3 ori pe zi \n" +
                "Vitamina C și suplimentele probiotice -  o dată pe zi până la mai multe administrări pe zi";

        assertEquals(retetaAsteptata, reteta);
    }

    @Test
    public void testOferaDiagnostic_TuseCanisa() {
        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie[] consultatii = new Consultatie[]{c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti", "necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, TUSE_CANISA);
        String retetaAsteptata = "Doxiciclină - 1-2 ori pe zi \n" +
                "Butamirat - 1-3 ori pe zi \n" +
                "Bromhexina - 1-3 ori pe zi \n" +
                "Suplimente alimentare cu vitamina C, Echinaceea - 1-2 ori pe zi \n";

        assertEquals(retetaAsteptata, reteta);
    }

    @Test
    public void testOferaDiagnostic_Rabie() {
        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie[] consultatii = new Consultatie[]{c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti", "necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, RABIE);
        String retetaAsteptata = " Programul de vaccinare include o doză de vaccin antirabic primar și revaccinări periodice pentru menținerea protecției.";

        assertEquals(retetaAsteptata, reteta);
    }

    @Test
    public void testOferaDiagnostic_BoliUsoare() {
        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);
        Consultatie c = new Consultatie(animal, "2023-05-25", LocalTime.of(10, 30), "Vet Clinic", true, false, Serviciu.ANALIZE);

        Consultatie[] consultatii = new Consultatie[]{c};
        MedicVeterinar m = new MedicVeterinar("Florin", "Bucuresti", "necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        String reteta = m.oferaDiagnostic(c, BOLI_USOARE);
        String retetaAsteptata = "Repaus și îngrijire adecvată: Asigurați-vă că animalul are un mediu liniștit și confortabil.\n" +
                "Hidratare: Asigurați-vă că animalul are acces la apă proaspătă și curată în permanență.\n" +
                "Alimentație adecvată: O dietă echilibrată și nutritivă.\n" +
                "Igienă și curățenie. \n" +
                "Suplimente alimentare naturale benefice pentru sănătatea pielii și a blănii.\n" +
                "Remedii naturale: ceaiul de mușețel poate fi folosit pentru a calma iritațiile pielii, iar aloe vera poate fi aplicată pe arsuri ușoare.";

        assertEquals(retetaAsteptata, reteta);
    }

}
