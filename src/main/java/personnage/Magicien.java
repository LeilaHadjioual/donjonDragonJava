package personnage;


public class Magicien extends Personnages{
    private String sort;
    private String philtre;



    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getPhiltre() {
        return philtre;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nsort : " + sort + "\nphiltre : " + philtre;
    }
}
