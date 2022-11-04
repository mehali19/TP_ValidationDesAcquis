package com.mycompany.tpvalidationdesacquisjakarta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AffichageEtudiants")
public class AffichageEtudiants extends HttpServlet {

    // Création liste etudiants
    ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getSession().setAttribute("Etudiants",listeEtudiants);
       
        
            Etudiant e1 = new Etudiant();
            e1.setId("1");
            e1.setNom("Etudiant1");
            e1.setMoyenne(12.0);
            listeEtudiants.add(e1);
            
            Etudiant e2 = new Etudiant();
            e2.setId("2");
            e2.setNom("Etudiant2");
            e2.setMoyenne(14.0);
            listeEtudiants.add(e2);
            
            Etudiant e3 = new Etudiant();
            e3.setId("3");
            e3.setNom("Etudiant3");
            e3.setMoyenne(9.0);
            listeEtudiants.add(e3);
            
            Etudiant e4 = new Etudiant();
            e4.setId("4");
            e4.setNom("Etudiant4");
            e4.setMoyenne(15.0);
            listeEtudiants.add(e4);
            
            Etudiant e5 = new Etudiant();
            e5.setId("5");
            e5.setNom("Etudiant5");
            e5.setMoyenne(8.0);
            listeEtudiants.add(e5);

       request.setAttribute( "Etudiants", listeEtudiants);     
       request.getRequestDispatcher("WEB-INF/etudiant.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        doGet(request, response);

    }

}
