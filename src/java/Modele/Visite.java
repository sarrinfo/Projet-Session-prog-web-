package Modele;
// Generated 2018-09-14 01:24:50 by Hibernate Tools 4.3.1


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Visite generated by hbm2java
 */
public class Visite  implements java.io.Serializable {


     private Date datevisite;
     private Client client;
     private Employe employe;
     private Bienimmobilier bienimmobilier;
     private String nom;

    public Visite() {
    }

	
    public Visite(Date datevisite) {
        this.datevisite = datevisite;
    }
    public Visite(Date datevisite, Client client, Employe employe, Bienimmobilier bienimmobilier, String nom) {
       this.datevisite = datevisite;
       this.client = client;
       this.employe = employe;
       this.bienimmobilier = bienimmobilier;
       this.nom = nom;
    }
    public Visite(Date datevisite, Employe employe, Bienimmobilier bienimmobilier) {
       this.datevisite = datevisite;
       this.employe = employe;
       this.bienimmobilier = bienimmobilier;
    }
   
    public Date getDatevisite() {
        return this.datevisite;
    }
    
    public void setDatevisite(Date datevisite) {
        this.datevisite = datevisite;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Employe getEmploye() {
        return this.employe;
    }
    
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    public Bienimmobilier getBienimmobilier() {
        return this.bienimmobilier;
    }
    
    public void setBienimmobilier(Bienimmobilier bienimmobilier) {
        this.bienimmobilier = bienimmobilier;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString(){
        Date date1 = datevisite;
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date = simple.format(date1);
        return ""+date;
    }


}


