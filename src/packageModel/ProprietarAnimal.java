package packageModel;

public class ProprietarAnimal extends Persoana
{
    private Animal animal;
    public ProprietarAnimal()
    {
        super();
        this.animal = null;
    }
    public ProprietarAnimal(String nume, String adresa, String telefon, String email, Sex sex, Animal animal)
    {
        super(nume, adresa, telefon, email, sex);
        this.animal = animal;
    }
    public void afisareProprietarAnimal()
    {
        super.afisarePersoana();

        System.out.println("===========================================================");
        System.out.println("Animalul proprietarului este afisat mai jos: ");

        animal.afisareAnimal();
    }
    public void programareConsultatie(Consultatie c)
    {
        c.setAnimal(this.animal);
        c.citesteDetaliiConsultatie();
    }
    public void verificareStatusConsultatie(Consultatie c)
    {
        if(c.getEsteFinalizata())
        {
            System.out.println("Consultatia a fost finalizata!");
            return;
        }

        System.out.println("Consultatia nu este finalizata!");
    }

    public boolean efectuarePlataConsulatie(Consultatie c, int plata)
    {
        int sumaServiciu = 0;
        boolean estePlatita = false;
        switch(c.getServiciu()){
            case VACCINARE:
                sumaServiciu = 20;
                break;
            case DEPARAZITARE:
                sumaServiciu = 30;
                break;
            case MICROCHIPARE:
                sumaServiciu = 40;
                break;
            case ANALIZE:
                sumaServiciu = 50;
                break;
            case OPERATIE:
                sumaServiciu = 60;
                break;
            case Nedeterminat:
                sumaServiciu = 0;
        }

        if(c.getEsteFinalizata() == true)
        {
            if(sumaServiciu == plata)
            {
                estePlatita = true;
                System.out.println("Plata a fost efectuata cu succes!");
            }
            else
            {
                System.out.println("Plata nu a putut fi realizata!");
            }

        }
        return estePlatita;
    }
}
