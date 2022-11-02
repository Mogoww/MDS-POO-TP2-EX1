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

    // equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Etudiant etudiant)) return false;

        if (getNumEtudiant() != etudiant.getNumEtudiant()) return false;
        if (getNom() != null ? !getNom().equals(etudiant.getNom()) : etudiant.getNom() != null) return false;
        return getPrenom() != null ? getPrenom().equals(etudiant.getPrenom()) : etudiant.getPrenom() == null;
    }

    // toString
    public String toString() {
        return "Prenom: " + this.prenom + "\tNom: " + this.nom + "\t(" + this.numEtudiant + ")";
    }
}
