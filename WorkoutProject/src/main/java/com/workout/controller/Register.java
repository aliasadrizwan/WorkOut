package com.workout.controller;

import com.workout.com.workout.dao.DataFacade;
import com.workout.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Get parameters from request and set to user object.
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        //TODO: Validate user here
        User user = new User(userName, password);
        //Add user to DAO
        DataFacade.addUser(user);
        //Save user into session
        req.getSession().setAttribute("user",user);
        //Redirect user to home page.
        resp.sendRedirect("index.jsp");
    }
}
