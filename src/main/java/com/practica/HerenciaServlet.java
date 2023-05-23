package com.practica;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HerenciaServlet")
public class HerenciaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action == null) {
            response.sendRedirect("index.jsp");
            return;
        }
        
        String output = "";
        
        if (action.equals("herencia")) {
            Animal animal = new Animal("Animal");
            output = animal.hacerSonido();
        } else if (action.equals("polimorfismo")) {
            Animal perro = new Perro("Perro", 5);
            output = perro.hacerSonido();
        } else if (action.equals("constructores")) {
            Circulo circulo = new Circulo(5);
            output = "Área del círculo: " + circulo.calcularArea();
        }
        
        request.setAttribute("output", output);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
