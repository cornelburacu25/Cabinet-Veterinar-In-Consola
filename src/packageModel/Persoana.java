package packageModel;

public class Persoana
{
    protected String nume;
    protected String adresa;
    protected String telefon;
    protected String email;
    protected Sex sex;
    public Persoana()
    {
        this.nume = "Necunoscut";
        this.adresa = "Neidentificata";
        this.telefon = "Neidentificat";
        this.email = "Necunoscut";
        this.sex = Sex.NEDEFINIT;
    }
    public Persoana(String nume, String adresa, String telefon, String email, Sex sex)
    {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
        this.sex = sex;
    }
    public void afisarePersoana()
    {
         System.out.println("Nume: " + this.nume);
         System.out.println("Adresa: " + this.adresa);
         System.out.println("Telefon: " + this.telefon);
         System.out.println("Email: " + this.email);
         System.out.println("Sex: " + this.sex);
    }
}