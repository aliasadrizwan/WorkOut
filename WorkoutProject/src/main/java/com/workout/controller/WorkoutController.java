package com.workout.controller;

import com.workout.model.User;
import com.workout.model.Workout;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/workout")
public class WorkoutController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("workout.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lift = req.getParameter("lift");
        int set = Integer.parseInt(req.getParameter("set"));
        int reps = Integer.parseInt(req.getParameter("reps"));

        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("user");
        List<Workout> workoutHistory = user.getHistory();
        Workout currentWorkout = workoutHistory.get(workoutHistory.size()-1);
    }
}
