package org.t246osslab.embtest.core.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.owasp.esapi.ESAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/ping" })
public class PingServlet extends HttpServlet {
    
    private static final Logger log = LoggerFactory.getLogger(PingServlet.class);

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter writer = null;
        try {
            res.setContentType("text/plain");
            writer = res.getWriter();
            writer.write(ESAPI.encoder().encodeForHTML("<test>"));
            writer.write("It works!");
        } catch (Exception e) {
            log.error("Exception occurs: ", e);
        } finally {
            if(writer != null){
                writer.close();
            }
        }
    }
}
