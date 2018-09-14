package Modele;
// Generated 2018-09-14 01:24:50 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Bail generated by hbm2java
 */
public class Bail  implements java.io.Serializable {


     private BailId id;
     private Locataire locataire;
     private Bienimmobilier bienimmobilier;
     private Date dateFin;

    public Bail() {
    }

	
    public Bail(BailId id, Locataire locataire, Bienimmobilier bienimmobilier) {
        this.id = id;
        this.locataire = locataire;
        this.bienimmobilier = bienimmobilier;
    }
    public Bail(BailId id, Locataire locataire, Bienimmobilier bienimmobilier, Date dateFin) {
       this.id = id;
       this.locataire = locataire;
       this.bienimmobilier = bienimmobilier;
       this.dateFin = dateFin;
    }
   
    public BailId getId() {
        return this.id;
    }
    
    public void setId(BailId id) {
        this.id = id;
    }
    public Locataire getLocataire() {
        return this.locataire;
    }
    
    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }
    public Bienimmobilier getBienimmobilier() {
        return this.bienimmobilier;
    }
    
    public void setBienimmobilier(Bienimmobilier bienimmobilier) {
        this.bienimmobilier = bienimmobilier;
    }
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }




}


