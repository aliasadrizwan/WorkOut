package com.workout.controller;

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
        Setting setting = SettingParser.buildSetting(req.getParameter("settings"));
        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("user");
        user.updateSetting(setting);
        resp.sendRedirect("/home");
    }
}
