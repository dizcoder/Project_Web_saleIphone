/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author anhqu
 */
public class ProcessServlet extends HttpServlet {

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
            out.println("<title>Servlet Process_Cart</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Process_Cart at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        Cart cart = null;
        Object o = session.getAttribute("cart");
        if (o != null) {
            cart = (Cart) o;
        } else {
            cart = new Cart();
        }
        String num_raw = request.getParameter("num").trim();
        String id_raw = request.getParameter("id");
        int id,num=0;
        try {
            id = Integer.parseInt(id_raw);
            num =Integer.parseInt(num_raw);
            ProductDAO pdb = new ProductDAO();
            Product p = pdb.getProductByID(id);
            int numStore=p.getQuantity();
            if((num == -1) && (cart.getQuantityById(id) <= 1)){
                cart.removeItem(id);
            } else{
                if((num==1) && cart.getQuantityById(id)>=numStore){
                    num=0;
                }
            float price = p.getPrice();
            Item t = new Item(p, num, price);                    
            cart.addItem(t);
            }
        } catch (NumberFormatException e) {
        }
        double total = cart.getTotalMoney();
      
        session.setAttribute("total", total);
        List<Item> list = cart.getItems();
        session.setAttribute("cart", cart);
        session.setAttribute("size", list.size());
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
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
        HttpSession session = request.getSession(true);
        Cart cart = null;
        if (session.getAttribute("cart") != null) {
            cart = (Cart) session.getAttribute("cart");
        }
        String action = request.getParameter("action");

        if (action.equals("additem")) {
            int id = Integer.parseInt(request.getParameter("id"));
            ProductDAO pdb = new ProductDAO();
            Product p = pdb.getProductByID(id);
            Item t = new Item(p, 1, p.getPrice());
            if (cart == null) {
                cart = new Cart();
            }
            cart.addItem(t);
        } else if (action.equals("removeitem")) {
            int id = Integer.parseInt(request.getParameter("id"));
            cart.removeItem(id);
        } else if (action.equals("checkout")) {

            response.sendRedirect("Home.jsp");
        }
        List<Item> list = cart.getItems();
        int amount = 0;
        for (Item l : list) {
            amount += l.getQuantity();
        }
        session.setAttribute("cart", cart);
        session.setAttribute("amount", amount);
        response.sendRedirect("Cart.jsp");

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
