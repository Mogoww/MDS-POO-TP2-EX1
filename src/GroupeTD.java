import java.util.ArrayList;

public class GroupeTD {

    //----------- Attributs -----------
    private ArrayList<Etudiant> listeEtudiants;
    private int nbEtudiants;

    //----------- méthodes -----------

    // ajouter un étudiant
    public void ajouterEtudiant(Etudiant etudiant) {
        this.listeEtudiants.add(etudiant);
        this.nbEtudiants++;
    }

    // créer un étudiant et l'ajouter à la liste
    public void ajouterEtudiant(int numEtudiant, String nom, String prenom) {
        Etudiant etudiant = new Etudiant(numEtudiant, nom, prenom);
        this.listeEtudiants.add(etudiant);
        this.nbEtudiants++;
    }

    // affiche les prénoms, noms, et numéros d'étudiants
    public void afficherEtudiants() {
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant.getPrenom() + " " + etudiant.getNom() + " (" + etudiant.getNumEtudiant()+ ");");
        }
    }

    // chercher un étudiant par son numéro, nom et prénom
    public int chercherEtudiant(int numEtudiant, String nom, String prenom) {
        for(Etudiant etudiant : listeEtudiants){
            if (etudiant.getNumEtudiant() == numEtudiant && etudiant.getNom().equals(nom) && etudiant.getPrenom().equals(prenom)) {
                return listeEtudiants.indexOf(etudiant);
            }
        }
        return -1;
    }

    // supprimer un étudiant
    public void supprimerEtudiant(int numEtudiant, String nom, String prenom) {
        int index = chercherEtudiant(numEtudiant, nom, prenom);
        if (index != -1) {
            listeEtudiants.remove(index);
            this.nbEtudiants--;
        }
    }


}
