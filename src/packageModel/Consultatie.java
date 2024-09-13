package packageModel;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Consultatie
{
    private Animal animal;
    private String dataConsultatie;
    private LocalTime oraConsultatie;
    private String locatieConsultatie;
    private Boolean esteConfirmata = false;
    private Boolean esteFinalizata = false;
    private Serviciu serviciu;
    private Diagnostic diagnostic = null;
    public Consultatie()
    {
        this.animal = new Animal();
        this.dataConsultatie = "Necunoscuta";
        this.oraConsultatie = LocalTime.parse("00:00");
        this.locatieConsultatie = "Necunoscuta";
        this.esteConfirmata = false;
        this.esteFinalizata = false;
        this.serviciu = Serviciu.Nedeterminat;
    }
    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }
    public void afisareConsultatie()
    {
        System.out.println("Animalul este: ");
        this.animal.afisareAnimal();
        System.out.println("Data consultatiei este: " + this.dataConsultatie);
        System.out.println("Ora consultatiei este: " + this.oraConsultatie);
        System.out.println("Locatia consultatiei este: " + this.locatieConsultatie);
        System.out.println("Serviciul este: " + this.serviciu);

        if (this.esteConfirmata == true)
        {
            System.out.println("Consultatia este confirmata");

            if (this.esteFinalizata == true)
                System.out.println("Consultatia este finalizata");

            else System.out.println("Consultatia nu este finalizata");
        }

        else System.out.println("Consultatia nu este confirmata");
    }
    public void citesteDetaliiConsultatie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți data consultatiei: ");
        this.dataConsultatie = scanner.nextLine();

        System.out.print("Introduceți ora consultatiei (HH:mm): ");
        String oraInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try
        {
            this.oraConsultatie = LocalTime.parse(oraInput, formatter);
        }

        catch (Exception e)
        {
            System.out.println("Ora introdusă este invalidă. Ora consultatiei va fi setată la 00:00.");
            this.oraConsultatie = LocalTime.parse("00:00");
        }

        System.out.print("Introduceți locația consultatiei: ");
        this.locatieConsultatie = scanner.nextLine();

        System.out.println("Lista de servicii este: \nVACCINARE,\n" +
                "    DEPARAZITARE,\n" +
                "    MICROCHIPARE,\n" +
                "    ANALIZE,\n" +
                "    OPERATIE,\n" +
                "    ALTE_SERVICII");

        System.out.print("Alegeti unul dintre aceste servicii: ");

        String serviciuInput = scanner.nextLine();
        serviciuInput = serviciuInput.toUpperCase();

        try
        {
            this.serviciu = Serviciu.valueOf(serviciuInput);
        }

        catch (IllegalArgumentException e)
        {
            System.out.println("Serviciul introdus este invalid. Serviciul va fi setat la Nedeterminat.");
            this.serviciu = Serviciu.Nedeterminat;
        }
    }
    public Boolean getEsteConfirmata()
    {
        return esteConfirmata;
    }
    public void setEsteConfirmata(Boolean esteConfirmata)
    {
        this.esteConfirmata = esteConfirmata;
    }
    public Boolean getEsteFinalizata()
    {
        return esteFinalizata;
    }
    public void setEsteFinalizata(Boolean esteFinalizata)
    {
        this.esteFinalizata = esteFinalizata;
    }
    public Serviciu getServiciu() { return serviciu; }
    public Diagnostic getDiagnostic() { return  diagnostic;}
    public void setDiagnostic(Diagnostic diagnostic) {this.diagnostic = diagnostic;}
}