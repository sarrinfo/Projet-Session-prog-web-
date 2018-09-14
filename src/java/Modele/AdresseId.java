package Modele;
// Generated 2018-09-14 01:24:50 by Hibernate Tools 4.3.1



/**
 * AdresseId generated by hbm2java
 */
public class AdresseId  implements java.io.Serializable {


     private String codepostal;
     private int numero;

    public AdresseId() {
    }

    public AdresseId(String codepostal, int numero) {
       this.codepostal = codepostal;
       this.numero = numero;
    }
   
    public String getCodepostal() {
        return this.codepostal;
    }
    
    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AdresseId) ) return false;
		 AdresseId castOther = ( AdresseId ) other; 
         
		 return ( (this.getCodepostal()==castOther.getCodepostal()) || ( this.getCodepostal()!=null && castOther.getCodepostal()!=null && this.getCodepostal().equals(castOther.getCodepostal()) ) )
 && (this.getNumero()==castOther.getNumero());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodepostal() == null ? 0 : this.getCodepostal().hashCode() );
         result = 37 * result + this.getNumero();
         return result;
   }   


}


