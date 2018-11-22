package com.workout.controller;

import com.workout.com.workout.dao.DataFacade;
import com.workout.model.LiftSetting;
import com.workout.model.Setting;
import com.workout.model.SettingParser;
import com.workout.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/settings")
public class SettingController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/settings.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("user");

        if(req.getParameter("rest") != null) {
            int rest = Integer.parseInt(req.getParameter("rest"));
            user.getSetting().setRestTime(rest);
        } else {
            String liftName = req.getParameter("name");
            int weight = Integer.parseInt(req.getParameter("weight"));
            int sets = Integer.parseInt(req.getParameter("sets"));
            int reps = Integer.parseInt(req.getParameter("reps"));
            int progress = Integer.parseInt(req.getParameter("progress"));
            Setting userSettings = user.getSetting();
            userSettings.addLiftSetting(new LiftSetting(liftName,weight,sets,reps,progress));
        }
    }
}
