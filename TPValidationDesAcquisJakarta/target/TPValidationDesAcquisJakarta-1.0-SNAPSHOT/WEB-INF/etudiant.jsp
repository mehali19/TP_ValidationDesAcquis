<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Affichage des étudiants !</h1>

        <ul>
            <c:forEach items="${ Etudiants }" var="etudiant">
                 <li>
                    nom : <c:out value="${ etudiant.getNom() }" /> 
                    id : <c:out value="${ etudiant.getId() }" /> 
                    moyenne : <c:out value="${ etudiant.getMoyenne() }" />
                </li>
            </c:forEach>
        </ul>
                
        <ol>
            <c:forEach items="${ Etudiants }" var="etudiant">
                 <li>
                    nom : <c:out value="${ etudiant.getNom() }" /> 
                    id : <c:out value="${ etudiant.getId() }" /> 
                    moyenne : <c:out value="${ etudiant.getMoyenne() }" />
                </li>
            </c:forEach>
        </ol>
                <!<!-- exercice 3 : Tableau -->   
                <table>
                    <tr>
                        <td></td>
                    </tr>
                </table>
    </body>
</html>
