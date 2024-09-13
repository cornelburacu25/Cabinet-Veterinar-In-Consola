package packageModel;

import java.util.Scanner;

public class AsistentMedical extends Persoana
{
    protected Consultatie listaConsultatii[];
    public AsistentMedical()
    {
        super();
        this.listaConsultatii = new Consultatie[0];
    }
    public AsistentMedical(String nume, String adresa, String telefon, String email, Sex sex, Consultatie[] listaConsultatii)
    {
        super(nume, adresa, telefon, email, sex);
        this.listaConsultatii = listaConsultatii;
    }
    public void vizualizareConsultatii()
    {
        System.out.println("Lista de consultatii va aparea mai jos: ");

        for (Consultatie consultatie : this.listaConsultatii)
            consultatie.afisareConsultatie();
    }
    public void confirmaConsultatie(Consultatie c)
    {
        if(c.getEsteConfirmata())
            return;

        c.afisareConsultatie();

        System.out.println("Doresti sa validezi consultatia?");
        System.out.println("1. Da");
        System.out.println("2. Nu");

        Scanner optiune = new Scanner(System.in);

        while (true)
        {
            String optiuneAleasa = optiune.nextLine();

            if (optiuneAleasa.equalsIgnoreCase("DA"))
            {
                c.setEsteConfirmata(true);
                break;
            }

            if (optiuneAleasa.equalsIgnoreCase("NU"))
            {
                break;
            }

            System.out.println("Optiunea aleasa nu este valida!");
        }

        optiune.close();
    }
    public void finalizeazaConsultatie(Consultatie c)
    {
        if(c.getEsteConfirmata())
            c.setEsteFinalizata(true);
    }
    public void afisareAsistentMedical()
    {
        super.afisarePersoana();
    }
}