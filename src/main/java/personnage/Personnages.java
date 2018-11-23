package personnage;


/**
 * The type Personnages.
 */
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


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets life.
     *
     * @return the life
     */
    public int getLife() {
        return life;
    }

    /**
     * Sets life.
     *
     * @param life the life
     */
    public void setLife(int life) {
        this.life = life;
    }


    /**
     * Gets picture.
     *
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets picture.
     *
     * @param picture the picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }


    /**
     * Gets force.
     *
     * @return the force
     */
    public int getForce() {
        return force;
    }

    /**
     * Sets force.
     *
     * @param force the force
     */
    public void setForce(int force) {
        this.force = force;
    }


    @Override
    public String toString() {
        return "détails du personnage" + "\nnom : " + name + "\nimage : " + picture + "\nvie : " + life + "\nForce : " + force;
    }
}
