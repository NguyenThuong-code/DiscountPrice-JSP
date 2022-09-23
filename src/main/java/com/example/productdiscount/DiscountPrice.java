package com.example.productdiscount;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DiscountPrice", value = "/discount")
public class DiscountPrice extends HttpServlet {
    //Discount Amount = List Price * Discount Percent * 0.01

@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("Price"));
        float percent= Float.parseFloat(req.getParameter("Percent"));

        double discountAmount= price*percent*0.01;
        double discountPrice = price-discountAmount;

        PrintWriter writer=resp.getWriter();
        writer.println("<html");
        writer.println("<h1> Discount amount: "+discountAmount+"</h1>");
        writer.println("<h1> Discount Price: " +discountPrice+"</h1>");
        writer.println("</html>");
    }

    public void destroy() {
    }
}