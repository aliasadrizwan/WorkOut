package com.workout.controller;

import com.workout.com.workout.dao.DataFacade;
import com.workout.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Remove session messages.
        req.getSession().removeAttribute("errorMessage");
        req.getSession().removeAttribute("successMessage");
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Retrieve user name and password from request.
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        Boolean flag = false;
        //TODO: validation for userName and password

        for(User user : DataFacade.getUserList()){
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
                req.getSession().setAttribute("user", user);
                resp.sendRedirect("index.jsp");
                return;
            }
        }

        req.getSession().setAttribute("errorMessage","Incorrect user name or password.");
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);

    }
}
