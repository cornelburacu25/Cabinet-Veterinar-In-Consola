package packageModel;

import java.time.LocalTime;

public class Main
{
    public static void main(String[] args)
    {
        Consultatie consultatie = new Consultatie();

        Animal animal = new Animal("Rex", "Caine", "Labrador", 2022, Sex.MASCULIN);

        ProprietarAnimal p = new ProprietarAnimal("George", "dsioayh", "077468453", "akdgf2374@akghdsf.com", Sex.MASCULIN, animal);

        p.afisareProprietarAnimal();

        p.programareConsultatie(consultatie);

        consultatie.afisareConsultatie();

        Consultatie consultatii [] = new Consultatie[] {consultatie};

        MedicVeterinar medicVeterinar = new MedicVeterinar("Florin", "Bucuresti","necunoscut", "nimeni", Sex.MASCULIN, consultatii);

        medicVeterinar.vizualizareConsultatii();

        for(Consultatie c : consultatii)
        {
           medicVeterinar.confirmaConsultatie(c);
        }

        p.verificareStatusConsultatie(consultatie);


        if(consultatie.getServiciu() == Serviciu.ANALIZE) {
            String reteta = medicVeterinar.oferaDiagnostic(consultatie);
            System.out.println(reteta);
        }

        medicVeterinar.finalizeazaConsultatie(consultatie);

        p.efectuarePlataConsulatie(consultatie, 50);

        p.verificareStatusConsultatie(consultatie);
    }
}