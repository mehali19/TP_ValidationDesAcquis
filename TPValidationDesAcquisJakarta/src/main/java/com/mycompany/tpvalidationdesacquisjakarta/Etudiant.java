package com.mycompany.tpvalidationdesacquisjakarta;

public class Etudiant {
    
    private String id;
    private String nom;
    private double moyenne;

    // Constructeur
    public Etudiant(String id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public Etudiant() {
    }
    
    // GETTERS & SETTERS
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    
    // A REVOIR (utilisation de equals(id) ou de instanceOf)
    public boolean equals(String id){
        if(this.equals(id)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", moyenne=" + moyenne + '}';
    }
    
    
}
