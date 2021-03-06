/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.ConnexionForm;
import Modele.Utilisateur;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */

public class Connexion extends HttpServlet {

    public static final String ATT_USER         = "utilisateur";

    public static final String ATT_FORM         = "form";

    public static final String ATT_SESSION_USER = "sessionUtilisateur";

    public static String VUE              = "/WEB-INF/connexion.jsp";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     

    }



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         /* Affichage de la page de connexion */

//        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

         /* Préparation de l'objet formulaire */

        ConnexionForm form = new ConnexionForm();


        /* Traitement de la requête et récupération du bean en résultant */

        Utilisateur utilisateur = form.connecterUtilisateur( request );


        /* Récupération de la session depuis la requête */

        HttpSession session = request.getSession();


        /**

         * Si aucune erreur de validation n'a eu lieu, alors ajout du bean

         * Utilisateur à la session, sinon suppression du bean de la session.

         */

        if ( form.getErreurs().isEmpty() && form.getVALIDE_PWD() ) {

            session.setAttribute( ATT_SESSION_USER, utilisateur );
            
            /* Stockage du formulaire et du bean dans l'objet request */
            request.setAttribute( ATT_FORM, form );
            request.setAttribute( ATT_USER, utilisateur );
            VUE = "/display.jsp";
            RequestDispatcher disp = request.getRequestDispatcher(VUE);
            disp.forward(request, response);

        } else {

            session.setAttribute( ATT_SESSION_USER, "" );
            response.sendRedirect(request.getContextPath()+VUE);

        }
 
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
