import java.util.ArrayList;

public class GroupeTD {

    //----------- Attributs -----------
    private ArrayList<Etudiant> listeEtudiants;
    private int nbEtudiants;
    private String nomGroupe;

    //----------- Constructeur -----------
    public GroupeTD(String nomGroupe) {
        this.nomGroupe = nomGroupe;
        this.listeEtudiants = new ArrayList<Etudiant>(10);
        this.nbEtudiants = 0;
    }

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
        return this.listeEtudiants.indexOf(new Etudiant(numEtudiant, nom, prenom));
    }

    // supprimer un étudiant
    public void supprimerEtudiant(int numEtudiant, String nom, String prenom) {
        int index = chercherEtudiant(numEtudiant, nom, prenom);
        if (index != -1) {
            this.listeEtudiants.remove(index);
            this.nbEtudiants--;
        }
    }


}
