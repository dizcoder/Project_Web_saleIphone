/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author Admin
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String u=request.getParameter("acc");
        String p=request.getParameter("pass");
        String r=request.getParameter("rem");
        AccountDAO ad=new AccountDAO();
        Account a=ad.checkAccount(u, p);
        if(a==null){
            String er="username: "+u+" and password: "+p+" don't exsited!";
            request.setAttribute("error", er);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        else{
            if(a.getUsername().equalsIgnoreCase("admin") && a.getPassword().equalsIgnoreCase("admin")){
            HttpSession session=request.getSession(true);
            session.setAttribute("admin", a);
            request.getRequestDispatcher("list").forward(request, response);
            }
            HttpSession session=request.getSession(true);
            session.setAttribute("admin", a);
            //tao cookie
            Cookie cu=new Cookie("acc", u);
            Cookie cp=new Cookie("pass", p);
            Cookie cr=new Cookie("rem", r);
            if(r==null){
                //nguoi dung k tick chuot--xoa khoi cookie
                cu.setMaxAge(0);
                cp.setMaxAge(0);
                cr.setMaxAge(0);
            }else{
                //nguoi dung tick chuot
                cu.setMaxAge(2*24*60*60);
                cp.setMaxAge(2*24*60*60);
                cr.setMaxAge(2*24*60*60);
            }
            //luu browse
            response.addCookie(cu);
            response.addCookie(cp);
            response.addCookie(cr);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
