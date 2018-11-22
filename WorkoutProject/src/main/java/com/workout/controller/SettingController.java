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
        boolean updateRest = false;

        LiftSetting liftSetting = null;
        int rest=0;

        if(req.getParameter("rest") != null) {
            rest = Integer.parseInt(req.getParameter("rest"));
            updateRest = true;
        } else {
            String liftName = req.getParameter("name");
            int weight = Integer.parseInt(req.getParameter("weight"));
            int sets = Integer.parseInt(req.getParameter("sets"));
            int reps = Integer.parseInt(req.getParameter("reps"));
            int progress = Integer.parseInt(req.getParameter("progress"));
            liftSetting = new LiftSetting(liftName,weight,sets,reps,progress);
        }

        HttpSession session = req.getSession();
        User user = getUser((String)session.getAttribute("user"));
        if (updateRest) {
            user.getSetting().setRestTime(rest);
        } else {
            user.getSetting().addLiftSetting(liftSetting);
        }

    }


    private User getUser(String username) {
        for(User u : DataFacade.getUserList()) {
            if (username.equals(u.getUserName())) {
                return u;
            }
        }
        return null;
    }
}
