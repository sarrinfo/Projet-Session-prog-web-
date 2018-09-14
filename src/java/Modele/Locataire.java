package Modele;
// Generated 2018-09-14 01:24:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Locataire generated by hbm2java
 */
public class Locataire  implements java.io.Serializable {


     private int locataireid;
     private String nom;
     private String prenom;
     private String telephone;
     private String courriel;
     private Set bails = new HashSet(0);
     private Set utilisateurs = new HashSet(0);

    public Locataire() {
    }

	
    public Locataire(int locataireid) {
        this.locataireid = locataireid;
    }
    public Locataire(int locataireid, String nom, String prenom, String telephone, String courriel, Set bails, Set utilisateurs) {
       this.locataireid = locataireid;
       this.nom = nom;
       this.prenom = prenom;
       this.telephone = telephone;
       this.courriel = courriel;
       this.bails = bails;
       this.utilisateurs = utilisateurs;
    }
    
    public Locataire(int locataireid, String nom, String prenom, String telephone, String courriel) {
       this.locataireid = locataireid;
       this.nom = nom;
       this.prenom = prenom;
       this.telephone = telephone;
       this.courriel = courriel;
    }
    public int getLocataireid() {
        return this.locataireid;
    }
    
    public void setLocataireid(int locataireid) {
        this.locataireid = locataireid;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getCourriel() {
        return this.courriel;
    }
    
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }
    public Set getBails() {
        return this.bails;
    }
    
    public void setBails(Set bails) {
        this.bails = bails;
    }
    public Set getUtilisateurs() {
        return this.utilisateurs;
    }
    
    public void setUtilisateurs(Set utilisateurs) {
        this.utilisateurs = utilisateurs;
    }




}


