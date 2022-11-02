public class Etudiant {

    // Attributs
    private int numEtudiant;
    private String nom;
    private String prenom;


    // getters et setters


    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Constructeur
    public Etudiant(int numEtudiant, String nom, String prenom) {
        this.numEtudiant = numEtudiant;
        this.nom = nom;
        this.prenom = prenom;
    }

}
