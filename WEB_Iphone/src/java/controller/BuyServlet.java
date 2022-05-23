///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import dal.OrderDAO;
//import dal.ProductDAO;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import model.Cart;
//import model.Item;
//import model.Product;
//
///**
// *
// * @author Admin
// */
//public class BuyServlet extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ItemServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ItemServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        //processRequest(request, response);
//        response.sendRedirect("Cart.jsp");
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        //processRequest(request, response);
//        HttpSession session = request.getSession();
//        session.setAttribute("size", 0);
//        Cart cart = null;
//        Object o = session.getAttribute("cart");
//        if (o != null) {
//            cart = (Cart) o;
//        } else {
//            cart = new Cart();
//        }
//
//        String num_raw = request.getParameter("num");
//        String id_raw = request.getParameter("id");
//        int num,id;
//        double total;
//        try {
//            id = Integer.parseInt(id_raw);
//            num = Integer.parseInt(num_raw);
//            ProductDAO pdb = new ProductDAO();
//            Product p = pdb.getProductByID(id);
//            float price = p.getPrice();
//            Item t = new Item(p, num, price);
//            OrderDAO d = new OrderDAO();          
//            d.updateQuantity(t.getProduct().getQuantity() - num, id);
//            cart.addItem(t);
//            
//        } catch (Exception e) {
//            num = 1;
//        }
//        List<Item> list = cart.getItems();
//        total = cart.getTotalMoney();
//      
//        session.setAttribute("total", total);
//        session.setAttribute("cart", cart);
//        session.setAttribute("size", list.size());
//        request.getRequestDispatcher("Cart.jsp").forward(request, response);
//
////        ProductDAO d=new ProductDAO();
////        List<Product> list=d.getAll();
////        Cookie[] arr=request.getCookies();
////        String txt="";
////        if(arr!=null){
////            for(Cookie o:arr){
////                if(o.getName().equals("cart")){
////                    txt+=o.getValue();
////                    o.setMaxAge(0);
////                    response.addCookie(o);
////                }
////            }
////        }
////        String num=request.getParameter("num");
////        String id=request.getParameter("id");
////        if(txt.isEmpty()){
////            txt=id+":"+num;
////        }else{
////            txt=txt+","+id+":"+num;
////        }
////        Cookie c=new Cookie("cart", txt);
////        c.setMaxAge(2*24*60*60);
////        response.addCookie(c);
////        request.getRequestDispatcher("home").forward(request, response);
//
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
