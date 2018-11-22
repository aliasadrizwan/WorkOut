package com.workout.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.workout.com.workout.dao.DataFacade;
import com.workout.model.User;
import com.workout.model.WorkoutHistory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/workout")
public class WorkoutController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ObjectMapper mapper = new ObjectMapper();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("workout.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String jsonSting = req.getParameter("workout");

        WorkoutHistory workout = mapper.readValue(jsonSting, WorkoutHistory.class);
        //add this as history in user.
        User user = (User)req.getSession().getAttribute("user");
        user.addWorkoutHistory(workout);

        PrintWriter out =resp.getWriter();
        try{
            out.print(mapper.writeValueAsString(workout));
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        }

       /* String lift = req.getParameter("lift");
        int set = Integer.parseInt(req.getParameter("set"));
        int reps = Integer.parseInt(req.getParameter("reps"));

        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("user");
        List<Workout> workoutHistory = user.getHistory();
        Workout currentWorkout = workoutHistory.get(workoutHistory.size()-1);*/
    }
}
