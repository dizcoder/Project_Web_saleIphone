/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Cart;
import model.Item;
import model.Order;
import model.Orderdetail;
import model.Product;

/**
 *
 * @author Admin
 */
public class OrderDAO extends DBContext{
    public void addOrder(Account acc, Cart c){
        LocalDate curDate = LocalDate.now();
        String date= curDate.toString();
        try {
            //add order 
            String sql = "insert into [Order] ([Date], Total, AccountID) values (?,?,?) ";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, date);
            st.setFloat(2, c.getTotalMoney());
            st.setInt(3, acc.getId());
            st.executeUpdate();
            
            // lay ra id cua order vua add
            String sqll = "select top 1 OrderId from [Order] order by OrderId desc";
            PreparedStatement st1 = connection.prepareStatement(sqll);
            ResultSet rs = st1.executeQuery();
            
            //add vao bang Orderdetail
            if (rs.next()) {
                int oid = rs.getInt("OrderId");
                for (Item i : c.getItems()) {
                    String sql2 = "insert into [OrderDetail] (ProductID, OrderID, Quantity, ProductPrice) values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, i.getProduct().getId());
                    st2.setInt(2, oid);
                    st2.setInt(3, i.getQuantity());
                    st2.setFloat(4, i.getPrice());
                    st2.executeUpdate();
                }
            }
            //cap nhat so luong san pham
            String sql3 = "update Product set Quantity = Quantity - ? where ProductID = ?";
            PreparedStatement st3 = connection.prepareStatement(sql3);
            for (Item i : c.getItems()) {
                   st3.setInt(1, i.getQuantity());
                   st3.setInt(2, i.getProduct().getId());
                   st3.executeUpdate();
            }
        } catch (Exception e) {
        }
    }
    
    public List<Order> getOrderByID(int aid) {
        List<Order> list = new ArrayList<>();
        String sql = "select o.OrderID, o.Total, o.Date, o.AccountID  \n" +
"                   from [Order] o inner join Account a \n" +
"                   on o.AccountID = a.AccountID\n" +
"                   where a.AccountID = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, aid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order p = new Order();
                p.setId(rs.getInt(1));
                p.setDate(rs.getString(2));
                p.setTotal(rs.getFloat(3));
                p.setCusid(rs.getInt(4));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

}
