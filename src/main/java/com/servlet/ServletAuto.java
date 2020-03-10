package com.servlet;

import com.dao.ClientDao;
import models.ClientEntity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletAuto")
public class ServletAuto extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public ServletAuto(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        this.getServletContext().getRequestDispatcher( "/registration.jsp" ).forward( request, response );

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //ClientDao clientDao = new ClientDao();
        //ClientEntity cli = clientDao.get(1);

        //request.setAttribute("cli", cli);
        this.getServletContext().getRequestDispatcher( "/registration.jsp" ).forward( request, response );

    }
}
