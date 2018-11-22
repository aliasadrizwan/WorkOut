package com.workout.controller;

import com.workout.com.workout.dao.DataFacade;
import com.workout.model.Profile;
import com.workout.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/profile")
public class ProfileController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Remove session messages.
        req.getSession().removeAttribute("errorMessage");
        req.getSession().removeAttribute("successMessage");
        //Forward request.
        req.getRequestDispatcher("WEB-INF/profile.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Get parameters from request and set to user object.
        String email = req.getParameter("email");
        double weight = Double.parseDouble(req.getParameter("weight"));
        double height = Double.parseDouble(req.getParameter("height"));
        //TODO: Validate profile here
        //create profile object
        Profile profile = new Profile(email, weight, height);
        //Save profile against logged in user.
        boolean result =(req.getSession().getAttribute("user")!=null)?DataFacade.addProfile(req.getSession().getAttribute("user").toString(),profile):false;

        if(result == false){
            req.getSession().setAttribute("errorMessage","Unable to add profile.");
            req.getRequestDispatcher("WEB-INF/profile.jsp").forward(req, resp);
        }
        else{
            req.getSession().setAttribute("successMessage","Profile added successfully.");
            req.getRequestDispatcher("WEB-INF/profile.jsp").forward(req, resp);
        }
    }
}
