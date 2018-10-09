/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modele.Annonce;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SARRINFO
 */
public class AnnonceDAO {
  
    
    static Session session = null;

    public static void insert(Annonce ann) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.save(ann);
        tx.commit();
        session.close();
    }
    
    public static void delete(Annonce ann) {
        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        session.delete(ann);
        tx.commit();
        session.close();
    }
    public static List allAnnonces() {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Annonce ");
        List<Annonce> results = query.list();

        return results;
        }
}
