package com.ibm.cloudoe.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setStatus(200);
        PrintWriter writer = response.getWriter();
        writer.println("Hello world from " + System.getenv("VCAP_APP_HOST") + ":" + System.getenv("VCAP_APP_PORT"));
        writer.println("");
        writer.println("This is a story all about how...");
        writer.println("");
        writer.println("There is always more to the story");
        writer.close();
    }
}
