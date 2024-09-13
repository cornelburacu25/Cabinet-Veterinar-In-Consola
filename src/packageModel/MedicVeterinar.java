package packageModel;

import java.util.Random;

public class MedicVeterinar extends AsistentMedical
{
    public MedicVeterinar()
    {
        super();
    }
    public MedicVeterinar(String nume, String adresa, String telefon, String email, Sex sex, Consultatie[] listaConsultatii)
    {
        super(nume, adresa, telefon, email, sex, listaConsultatii);
    }
    public void afisareMedicVeterinar()
    {
        super.afisareAsistentMedical();
    }

    public String oferaDiagnostic(Consultatie c)
    {
        String reteta = "";
        if(c.getServiciu() == Serviciu.ANALIZE)
        {
            Diagnostic[] diagnosticValues = Diagnostic.values();
            Random random = new Random();
            int randomIndex = random.nextInt(diagnosticValues.length);
            Diagnostic randomDiagnostic = diagnosticValues[randomIndex];
            c.setDiagnostic(randomDiagnostic);
        }

        switch(c.getDiagnostic()){
            case Nedeterminat:
                reteta = "";
                break;
            case RACEALA:
                reteta = "Butorphanol - de 1-3 ori pe zi \n " +
                        "Paracetamol - o data pe zi \n " +
                        "Suplimente de Vitamina C - 3 ori pe zi";
                break;
            case GASTROENTERITA:
                reteta = "saruri si electroliti - Rehydion, in portii mici \n" +
                        "Metoclopramida - 1-3 ori pe zi \n" +
                        "Smectita - 1-3 ori pe zi \n" +
                        "Bifidobacterium animalis - 2 ori pe zi";
                break;
            case PARVOVIROZA:
                reteta = "Soluții izotonice de rehidratare sau soluții Ringer lactat - in portii mici \n" +
                        "Soluții electrolitice - o dată pe zi până la mai multe administrări pe zi \n" +
                        "Metoclopramida - 1-3 ori pe zi";
                break;
            case DISTEMPER:
                reteta = "Soluții izotonice de rehidratare sau soluții Ringer lactat - in portii mici \n" +
                        "Doxiciclina - 1-2 ori pe zi \n" +
                        "Paracetamol - 1-3 ori pe zi \n" +
                        "Vitamina C și suplimentele probiotice -  o dată pe zi până la mai multe administrări pe zi";
                break;
            case TUSE_CANISA:
                reteta = "Doxiciclină - 1-2 ori pe zi \n" +
                        "Butamirat - 1-3 ori pe zi \n" +
                        "Bromhexina - 1-3 ori pe zi \n" +
                        "Suplimente alimentare cu vitamina C, Echinaceea - 1-2 ori pe zi \n";
                break;
            case RABIE:
                reteta = " Programul de vaccinare include o doză de vaccin antirabic primar și revaccinări periodice pentru menținerea protecției.";
                break;
            case BOLI_USOARE:
                reteta = "Repaus și îngrijire adecvată: Asigurați-vă că animalul are un mediu liniștit și confortabil.\n" +
                        "Hidratare: Asigurați-vă că animalul are acces la apă proaspătă și curată în permanență.\n" +
                        "Alimentație adecvată: O dietă echilibrată și nutritivă.\n" +
                        "Igienă și curățenie. \n" +
                        "Suplimente alimentare naturale benefice pentru sănătatea pielii și a blănii.\n" +
                        "Remedii naturale: ceaiul de mușețel poate fi folosit pentru a calma iritațiile pielii, iar aloe vera poate fi aplicată pe arsuri ușoare.";
                break;
        }
        return reteta;
    }

    public String oferaDiagnostic(Consultatie c, Diagnostic diagnostic)
    {
        String reteta = "";
        c.setDiagnostic(diagnostic);

        if(c.getServiciu() == Serviciu.ANALIZE) {
            switch (c.getDiagnostic()) {
                case Nedeterminat:
                    reteta = "";
                    break;
                case RACEALA:
                    reteta = "Butorphanol - de 1-3 ori pe zi \n " +
                            "Paracetamol - o data pe zi \n " +
                            "Suplimente de Vitamina C - 3 ori pe zi";
                    break;
                case GASTROENTERITA:
                    reteta = "saruri si electroliti - Rehydion, in portii mici \n" +
                            "Metoclopramida - 1-3 ori pe zi \n" +
                            "Smectita - 1-3 ori pe zi \n" +
                            "Bifidobacterium animalis - 2 ori pe zi";
                    break;
                case PARVOVIROZA:
                    reteta = "Soluții izotonice de rehidratare sau soluții Ringer lactat - in portii mici \n" +
                            "Soluții electrolitice - o dată pe zi până la mai multe administrări pe zi \n" +
                            "Metoclopramida - 1-3 ori pe zi";
                    break;
                case DISTEMPER:
                    reteta = "Soluții izotonice de rehidratare sau soluții Ringer lactat - in portii mici \n" +
                            "Doxiciclina - 1-2 ori pe zi \n" +
                            "Paracetamol - 1-3 ori pe zi \n" +
                            "Vitamina C și suplimentele probiotice -  o dată pe zi până la mai multe administrări pe zi";
                    break;
                case TUSE_CANISA:
                    reteta = "Doxiciclină - 1-2 ori pe zi \n" +
                            "Butamirat - 1-3 ori pe zi \n" +
                            "Bromhexina - 1-3 ori pe zi \n" +
                            "Suplimente alimentare cu vitamina C, Echinaceea - 1-2 ori pe zi \n";
                    break;
                case RABIE:
                    reteta = " Programul de vaccinare include o doză de vaccin antirabic primar și revaccinări periodice pentru menținerea protecției.";
                    break;
                case BOLI_USOARE:
                    reteta = "Repaus și îngrijire adecvată: Asigurați-vă că animalul are un mediu liniștit și confortabil.\n" +
                            "Hidratare: Asigurați-vă că animalul are acces la apă proaspătă și curată în permanență.\n" +
                            "Alimentație adecvată: O dietă echilibrată și nutritivă.\n" +
                            "Igienă și curățenie. \n" +
                            "Suplimente alimentare naturale benefice pentru sănătatea pielii și a blănii.\n" +
                            "Remedii naturale: ceaiul de mușețel poate fi folosit pentru a calma iritațiile pielii, iar aloe vera poate fi aplicată pe arsuri ușoare.";
                    break;
            }
        }
        return reteta;
    }
}