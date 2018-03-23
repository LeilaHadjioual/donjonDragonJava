package personnage;


public class Guerrier extends Personnages {
    private String tableauWeapon[] = new String[10]; //tableau vide de 10 string max
    private String bouclier;


    public String[] getTableauWeapon() {
        return tableauWeapon;
    }

    public void setTableauWeapon(String[] tableauWeapon) {
        this.tableauWeapon = tableauWeapon;
    }

    public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    @Override
    public String toString() {
        return super.toString() + "\narme : " + toStringArmes() + "\nbouclier : " + bouclier;
    }

    //-----------méthode qui utilise le tableau et retourne des chaines de caractères--------------------
    public String toStringArmes() {
        String retour = "";
        for (int i = 0; i < tableauWeapon.length; i++) {
            if (tableauWeapon[i] != null) { //condition pour afficher les armes saisies (sinon affiche null si pas 10 armes saisies)
               retour = retour + "\narme " + i + " : " + tableauWeapon[i];
            }
        }
        return retour;
    }
}
