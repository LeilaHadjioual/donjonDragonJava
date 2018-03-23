package personnage;


public class Personnages {

    private String name;
    private String picture;
    private int life;
    private int force;

    //-----------------création d'un personnage---------------
//    public void createCharacter() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("saisir un nom ");
//        String nom = sc.nextLine();
//        name = nom;
//        System.out.println("Son nom est : " + nom);
//
//        System.out.println("Choisir une image ");
//        String image = sc.nextLine();
//        picture = image;
//        System.out.println("Son image est : " + image);
//
//
//        System.out.println("niveau vie ?");
//        int vie = sc.nextInt();
//        life = vie;
//        System.out.println("niveau de vie à " + vie);
//
//        System.out.println("Quelle est sa force d'attaque? ");
//        int attaque = sc.nextInt();
//        force = attaque;
//        System.out.println("Force à " + attaque);
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }


    @Override
    public String toString() {
        return "détails du personnage" + "\nnom : " + name + "\nimage : " + picture + "\nvie : " + life + "\nForce : " + force;
    }
}
