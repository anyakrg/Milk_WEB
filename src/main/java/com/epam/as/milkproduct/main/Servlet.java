package com.epam.as.milkproduct.main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.epam.as.milkproduct.entity.Delivery;
import com.epam.as.milkproduct.entity.DeliveryFactory;
import com.epam.as.milkproduct.entity.ProductFactory;

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          PrintWriter out = response.getWriter();
//           out.println("hello");
        Delivery delivery = DeliveryFactory.createRandomDelivery();
        request.setAttribute("delivery", delivery);

        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
    }
}
