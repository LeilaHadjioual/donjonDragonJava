package personnage;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * The type Jeu.
 */
public class Jeu {
    private static Scanner sc = new Scanner(System.in);
    private static String reponse = "";
    private static int enterNb;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String tableauPersonnage[] = {"magicien", "guerrier"};
        char choice;
        ArrayList<Personnages> listCharacters = new ArrayList();
        Personnages character = null;

//-------------------------------------création d'un personnage-------------------------------------
        createCharacter(character, listCharacters, tableauPersonnage);

//-----------------------------------------menu pour modifier ou afficher le personnage----------------------------------
        do {
            System.out.println("Que voulez-vous faire ? \n1-Afficher un personnage \n2-Modifier votre personnage \n3-Attaquer \n4-Créer un personnage \n0-Exit");
            enterNb = sc.nextInt();
            sc.nextLine();

//-----------------------------------------------afficher le personnage----------------------------------------------------
            if (enterNb == 1) {
                //Afficher la liste des personnages
                displayCharacters(listCharacters);
                //Récupérer le choix de l'utilisateur
                int persoSelected = sc.nextInt();
                sc.nextLine();
                //Afficher le personnage sélectionné
                System.out.println(listCharacters.get(persoSelected));
            }

//----------------------------------------------modifier le personnage--------------------------------------------------
            if (enterNb == 2) {
                displayCharacters(listCharacters);
                int persoSelected = sc.nextInt();
                sc.nextLine();
                System.out.println(listCharacters.get(persoSelected));
                System.out.println("Pour modifier : \n1-Nom  \n2-Image \n3-Niveau vie \n4-Force ");

                if (reponse.equals("guerrier")) {
                    System.out.println("5-Arme \n6-Bouclier");
                } else {
                    System.out.println("5-Sort \n6-Philtre");
                }
                enterNb = sc.nextInt();
                sc.nextLine();
                modifCharacter(listCharacters.get(persoSelected), enterNb);
//                if (enterNb == 1) {
//                    System.out.println("vous voulez changer :" + character.name + "\nsaisir le nouveau nom : ");
//                    String newName = sc.nextLine();
//                    character.setName(newName);
//                    System.out.println("son nouveau nom : " + newName);
//                } else if (enterNb == 2) {
//                    System.out.println("vous voulez changer :" + character.picture + "\nchoisir la nouvelle image : ");
//                    String newImage = sc.nextLine();
//                    character.setPicture(newImage);
//                    System.out.println("son nouveau nom : " + newImage);
//                }else if (enterNb == 3) {
//                    System.out.println("vous voulez changer :" + character.life + "\nsaisir le niveau de vie : ");
//                    int newLife = sc.nextInt();
//                    character.setLife(newLife);
//                    System.out.println("son nouveau nom : " + newLife);
//                }else if (enterNb == 4) {
//                    System.out.println("vous voulez changer :" + character.force + "\nsaisir le niveau de force : ");
//                    int newForce = sc.nextInt();
//                    character.setForce(newForce);
//                    System.out.println("son nouveau nom : " + newForce);
//                }
//                else {
//                    System.out.println("Cette commande n'existe pas");
//                }
            }
//            else {
//                System.out.println("erreur");
//            }
            if (enterNb == 3) {
                displayCharacters(listCharacters);
                int persoSelected = sc.nextInt();
                sc.nextLine();
                attack(listCharacters.get(persoSelected));
            }
            if (enterNb == 4) {
                createCharacter(character, listCharacters, tableauPersonnage);
            }

        } while (enterNb != 0);
    }

    /**
     * Create character.
     *
     * @param character         the character
     * @param listCharacters    the list characters
     * @param tableauPersonnage the tableau personnage
     */


//    public String changeName() {
//        Scanner sc = new Scanner(System.in);
//        Personnages showCharacter = null;
//        String name = " ";
//        System.out.println("pour modifier : \nNom : taper 1 \nImage : taper 2 \nNiveau vie : taper 3");
//        int enterNb = sc.nextInt();
//        sc.nextLine();
//        if (enterNb == 1) {
//            System.out.println("vous voulez changer :" + showCharacter.addName() + "\nsaisir le nouveau nom : ");
//            name = sc.nextLine();
//            System.out.println("son nouveau nom : " + name);
//            showCharacter.name = name;
//                    System.out.println(showCharacter.addName());
//        } else {
//            System.out.println("exit");
//        }return name;
//    }

    /**
     * Cette méthode sert à créer un personnage
     * @param character : le personnage créé
     * @param listCharacters : liste des personnages ou l'on rajoute le personnage créé
     * @param tableauPersonnage :tableau des differentes catégories de personnage
     */
    //--------------------Méthode pour créer un personnage-------------------------------------
    public static void createCharacter(Personnages character, ArrayList<Personnages> listCharacters, String tableauPersonnage[]){
        char choice;

        do {
            choice = ' ';
            //------------------------------affiche la liste des catégories de personnage---------------------------------
            System.out.println("liste des personnages ");
            for (int i = 0; i < tableauPersonnage.length; i++) {
                System.out.println(tableauPersonnage[i]);
            }

            System.out.println("Veuillez saisir un personnage :");
            reponse = sc.nextLine();
            System.out.println("Vous avez choisi : " + reponse);

            if (reponse.equals("guerrier")) {
                character = createWarrior(listCharacters);

            } else if (reponse.equals("magicien")) {
                character = createMagician(listCharacters);

            } else {
                System.out.println("ce personnage n'existe pas");

                do {
                    System.out.println("Voulez-vous essayer à nouveau ? (Y/N)");
                    choice = sc.nextLine().charAt(0);
                } while (choice != 'Y' && choice != 'N');

                if (choice == 'N') {
                    System.out.println("Au revoir…");
                }
            }
        } while (choice == 'Y');
    }

    /**
     * Display characters.
     *
     * @param listCharacters the list characters
     */
//-------------------Méthode pour afficher la liste des personnages----------------------------
    public static void displayCharacters(ArrayList<Personnages> listCharacters){
        System.out.println("Choisissez un personnage\n");
        for (int i=0; i < listCharacters.size(); i++){
            System.out.println(i + ": " + listCharacters.get(i).getName());
        }
    }

    /**
     * Add weapon string [ ].
     *
     * @return the string [ ]
     */
//--------------------------ajouter une arme--------------------------------------------------------
    public static String[] addWeapon() { //création d'une méthode qui retourne un tableau de string
        String tabWeapon[] = new String[10]; //création d'un tableau vide de 10 indices max
        int cpt = 1; //création d'un compteur pour pouvoir stopper la saisie du nbr d'arme
        String choice;
        do {
            System.out.println("saisir une arme ");
            tabWeapon[cpt] = sc.nextLine(); //stocke la saisie dans le tableau
            cpt++;//ajoute un au compteur

            System.out.println("Voulez-vous saisir une autre arme ((O/N) ?");
            choice = sc.nextLine();
        } while (choice.equals("O") && cpt < 10); //effectue le do tant que le choix est =oui et le compteur inf à 10

        return tabWeapon;
    }

    /**
     * Add bouclier string.
     *
     * @return the string
     */
//--------------------------ajouter un bouclier-----------------------------------------------------
    public static String addBouclier() {
        System.out.println("saisir un bouclier ");
        String bouclier = sc.nextLine();
        return bouclier;
//        char choice = ' ';
//        do {
//            System.out.println("Voulez-vous un bouclier ? (Y/N)");
//            choice = sc.nextLine().charAt(0);
//        } while (choice != 'Y' && choice != 'N');
//
//        if (choice == 'Y')
//            System.out.println("bouclier attribué");
//        else
//            System.out.println("vous n'aurez pas de bouclier");
//        return choice;
    }

    /**
     * Add sort string.
     *
     * @return the string
     */
//--------------------------ajouter un sort-----------------------------------------------------
    public static String addSort() {
        System.out.println("ajouter un sort ");
        String sort = sc.nextLine();
        return sort;
    }

    /**
     * Add philtre string.
     *
     * @return the string
     */
//--------------------------ajouter un philtre----------------------------------------------------
    public static String addPhiltre() {
        System.out.println("ajouter un philtre ");
        String philtre = sc.nextLine();
        return philtre;
    }

    /**
     * Add name string.
     *
     * @return the string
     */
//--------------------------ajouter un nom-----------------------------------------------------
    public static String addName() {

        System.out.println("saisir un nom ");
        String name = sc.nextLine();
        System.out.println("Son nom est : " + name);
        return name;
    }

    /**
     * Add life int.
     *
     * @return the int
     */
//--------------------------ajouter vie -----------------------------------------------------
    public static int addLife() {
        System.out.println("niveau vie ?");
        int life = sc.nextInt();
        sc.nextLine();
        System.out.println("niveau de vie à " + life);
        return life;
    }

    /**
     * Add picture string.
     *
     * @return the string
     */
//--------------------------ajouter une image-----------------------------------------------------
    public static String addPicture() {
        System.out.println("Choisir une image ");
        String picture = sc.nextLine();
        System.out.println("Son image est : " + picture);
        return picture;
    }

    /**
     * Add force int.
     *
     * @return the int
     */
//--------------------------ajouter force-----------------------------------------------------
    public static int addForce() {
        System.out.println("Quelle est sa force d'attaque? ");
        int force = sc.nextInt();
        sc.nextLine();
        System.out.println("Force à " + force);
        return force;
    }

    /**
     * Create warrior personnages.
     *
     * @param listCharacters the list characters
     * @return the personnages
     */
//--------------------------créer un guerrier-----------------------------------------------------
    public static Personnages createWarrior(ArrayList<Personnages> listCharacters) {
        Guerrier guerrier1 = new Guerrier();
        guerrier1.setName(addName());
        guerrier1.setForce(addForce());
        guerrier1.setLife(addLife());
        guerrier1.setPicture(addPicture());
        guerrier1.setBouclier(addBouclier());
        guerrier1.setTableauWeapon(addWeapon());
        listCharacters.add(guerrier1);

        return guerrier1;
    }

    /**
     * Create magician personnages.
     *
     * @param listCharacters the list characters
     * @return the personnages
     */
//--------------------------créer un magicien-----------------------------------------------------
    public static Personnages createMagician(ArrayList<Personnages> listCharacters) {
        Magicien magicien1 = new Magicien();
        magicien1.setName(addName());
        magicien1.setForce(addForce());
        magicien1.setLife(addLife());
        magicien1.setPicture(addPicture());
        magicien1.setSort(addSort());
        magicien1.setPhiltre(addPhiltre());
        listCharacters.add(magicien1);

        return magicien1;
    }

    /**
     * Modif character.
     *
     * @param p       the p
     * @param enterNb the enter nb
     */
//--------------------------modifier un personnage-----------------------------------------------------
    public static void modifCharacter(Personnages p, int enterNb) {
        switch (enterNb) {
            case 1:
                System.out.println("vous voulez changer :" + p.getName());
                p.setName(addName());
                break;
            case 2:
                System.out.println("vous voulez changer :" + p.getPicture());
                p.setPicture(addPicture());
                break;
            case 3:
                System.out.println("vous voulez changer :" + p.getLife());
                p.setLife(addLife());
                break;
            case 4:
                System.out.println("vous voulez changer :" + p.getForce());
                p.setForce(addForce());
                break;
            case 5:
                if (enterNb == 5 && reponse.equals("guerrier")) {
                    System.out.println("vous voulez changer vos armes? (O/N)");//modification de toutes les armes
                    if (sc.nextLine().equals("O")) {
                        ((Guerrier) p).setTableauWeapon(addWeapon());
                    }
                } else {
                    System.out.println("vous voulez changer :" + ((Magicien) p).getSort());
                    ((Magicien) p).setSort(addSort());
                }
                break;
            case 6:
                if (enterNb == 6 && reponse.equals("guerrier")) {
                    System.out.println("vous voulez changer :" + ((Guerrier) p).getBouclier());
                    ((Guerrier) p).setBouclier(addBouclier());
                } else {
                    System.out.println("vous voulez changer :" + ((Magicien) p).getPhiltre());
                    ((Magicien) p).setPhiltre(addPhiltre());
                }
                break;
            default:
        }
    }

    /**
     * Attack int.
     *
     * @param p the p
     * @return the int
     */
//------------------------lancer une attaque--------------------------------------
    public static int attack(Personnages p) {
        System.out.println("votre force d'attaque est de : " + p.getForce() + " \nsaisir un niveau d'attaque inférieur ou égal à " + p.getForce());
        int attackLevel = sc.nextInt();
        System.out.println("attaque de force " + attackLevel);
        if (attackLevel > p.getForce()) {
            System.out.println("vous ne pouvez pas attaquer, niveau d'attaque supérieur à votre force");
            attackLevel = sc.nextInt();
            sc.nextLine();
        }
        int force = p.getForce();
        force -= attackLevel;
        p.setForce(force);
        System.out.println("Attaque !!!! \nforce restante : " + force);
        return force;
    }

}





