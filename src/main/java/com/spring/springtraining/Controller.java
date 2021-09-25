package com.spring.springtraining;

import com.spring.springtraining.model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/")
public class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Controller() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Person> staff = new ArrayList<>();
        staff.add(new Person("Jeff", 39));
        staff.add(new Person("Tara", 39));
        staff.add(new Person("Dean", 1));

        request.setAttribute("staff", staff);

        request.getRequestDispatcher("view.jsp").forward(request, response);
        }
}