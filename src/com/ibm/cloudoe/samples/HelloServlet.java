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
        writer.println("\tOnce upon a time there was a dragon.  Not a particularly large or ferocious dragon, but a dragon none the less.  This dragon happens to be the focus of our tale.  One would expect a dragon to have a name and this particular dragon's name was Gnarl.  While this might seem like a peculiar name for eithe ryou or me, this name was perfectly suitable for a dragon.\n\tNow you might be asking yourself, \"What does this dragon look like?\"  This dragon, Gnarl, was a dark shade of brown.  Not quite mud colored, but close.");
        writer.close();
    }
}
