package packageModel;

public class Animal
{
    private String nume;
    private String rasa;
    private String specie;
    private int anNastere;
    private Sex sex;
    public Animal()
    {
        this.nume = "Necunoscut";
        this.rasa = "Necunoscuta";
        this.specie = "Necunoscuta";
        this.anNastere = 0;
        this.sex = Sex.NEDEFINIT;
    }
    public Animal(String nume, String rasa, String specie, int anNastere, Sex sex)
    {
        this.nume = nume;
        this.rasa = rasa;
        this.specie = specie;
        this.anNastere = anNastere;
        this.sex = sex;
    }
    public void afisareAnimal()
    {
        System.out.println("Nume: " + this.nume);
        System.out.println("Rasa: " + this.rasa);
        System.out.println("Specie: " + this.specie);
        System.out.println("An nastere: " + this.anNastere);
        System.out.println("Sex: " + this.sex);
    }
}