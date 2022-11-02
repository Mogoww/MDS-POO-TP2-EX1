public class SuiviPromo {
    public static void main(String[] args) {
        GroupeTD groupeTD1 = new GroupeTD("TD1");
        GroupeTD groupeTD2 = new GroupeTD("TD2");

        Etudiant etudiant1 = new Etudiant(1, "Dupont", "Jean");
        Etudiant etudiant2 = new Etudiant(2, "Durand", "Pierre");
        Etudiant etudiant3 = new Etudiant(3, "Martin", "Paul");
        Etudiant etudiant4 = new Etudiant(4, "Bernard", "Jacques");
        Etudiant etudiant5 = new Etudiant(5, "Thomas", "Marie");
        Etudiant etudiant6 = new Etudiant(6, "Robert", "Luc");

        groupeTD1.ajouterEtudiant(etudiant1);
        groupeTD1.ajouterEtudiant(etudiant2);
        groupeTD1.ajouterEtudiant(etudiant3);
        groupeTD1.ajouterEtudiant(etudiant4);

        groupeTD2.ajouterEtudiant(etudiant5);
        groupeTD2.ajouterEtudiant(etudiant6);


        System.out.println("Liste des étudiants du groupe TD1:");
        groupeTD1.afficherEtudiants();
        System.out.println("Liste des étudiants du groupe TD2:");
        groupeTD2.afficherEtudiants();

        // modification du nom de l'étudiant 2 du groupe TD1
        etudiant2.setNom("Durand-Martin");

        System.out.println("Liste des étudiants du groupe TD1:");
        groupeTD1.afficherEtudiants();



        // suppression du dernier étudiant du groupe TD2 et TD1
        groupeTD2.supprimerEtudiant(etudiant6.getNumEtudiant(), etudiant6.getNom(), etudiant6.getPrenom());
        groupeTD1.supprimerEtudiant(etudiant4.getNumEtudiant(), etudiant4.getNom(), etudiant4.getPrenom());

        groupeTD1.ajouterEtudiant(etudiant6);
        groupeTD2.ajouterEtudiant(etudiant4);

        System.out.println("Liste des étudiants du groupe TD1:");
        groupeTD1.afficherEtudiants();
        System.out.println("Liste des étudiants du groupe TD2:");
        groupeTD2.afficherEtudiants();

    }
}
