/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cart;
import model.Category;
import model.Item;
import model.Product;

/**
 *
 * @author Admin
 */
public class ProductDAO extends DBContext{
    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getFloat(3));
                p.setDiscount(rs.getInt(4));
                p.setImage(rs.getString(5));
                p.setColor(rs.getString(6));
                p.setSize(rs.getInt(7));
                p.setQuantity(rs.getInt(8));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<Category> getAllCate() {
        List<Category> listC = new ArrayList<>();
        String a = "select * from Category";
        try {
            PreparedStatement st = connection.prepareStatement(a);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                listC.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listC;
    }

    
    public List<Product> getAllSearch(String name) {
        List<Product> list = new ArrayList<>();
        String sql = "select p.ProductID, p.name, p.price, p.discount, p.image, p.color, p.Size, p.quantity, c.CategoryID as cid, c.Categoryname as cname\n"
                + " from Product p inner join Category c\n"
                + " on (p.CategoryID = c.CategoryID)\n"
                + " where p.name like '%"+name+"%'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("ProductID"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getFloat("price"));
                p.setDiscount(rs.getInt("discount"));
                p.setImage(rs.getString("image"));
                p.setColor(rs.getString("color"));
                p.setSize(rs.getInt("Size"));
                p.setQuantity(rs.getInt("quantity"));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getCatByID(int id) {
        List<Product> list = new ArrayList<>();
        String sql = "select p.ProductID, p.name, p.price, p.discount, p.image, p.color, p.Size, p.quantity  \n" +
"                    from Product p inner join Category c \n" +
"                    on p.CategoryID=c.CategoryID \n" +
"                    where p.CategoryID=?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getFloat(3));
                p.setDiscount(rs.getInt(4));
                p.setImage(rs.getString(5));
                p.setColor(rs.getString(6));
                p.setSize(rs.getInt(7));
                p.setQuantity(rs.getInt(8));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public Product getProductByID(int id) {
        String sql = "select p.ProductID, p.name, p.price, p.discount, p.image, p.color, p.Size, p.quantity \n" 
                   + " from Product p inner join Category c \n" 
                   + " on p.CategoryID=c.CategoryID \n" 
                   + " where p.ProductID = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getFloat(3),
                        rs.getInt(4), 
                        rs.getString(5), 
                        rs.getString(6), 
                        rs.getInt(7), 
                        rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void insert( String name, float price, int discount, String image, String color, int size, int quantity) {
        String sql = "INSERT INTO  Product ( name, price, discount, [image], color, Size, quantity) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            Product p = new Product();
            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setInt(3, discount);
            ps.setString(4, image);
            ps.setString(5, color);
            ps.setInt(6, size);
            ps.setInt(7, quantity);

            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean checkIdExist(int id) {
        List<Product> list = getAll();
        for (Product l : list) {
            if (l.getId()==id) {
                return true;
            }
        }
        return false;
    }
    
    public void deleteProduct(int id) {
        String sql = "DELETE FROM Product WHERE ProductID=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(int id, String name, float price, int discount, String image, String color, int size, int quantity) {
        String sql = "Update Product set name=?, price=?, discount=?, [image]=?, color=?, Size=?, quantity=? where ProductID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setInt(3, discount);
            ps.setString(4, image);
            ps.setString(5, color);
            ps.setInt(6, size);
            ps.setInt(7, quantity);
            ps.setInt(8, id);

            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Product> getProductByPage(List<Product> list, int start, int end){
        List<Product> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
    
     public boolean checkSoLuongSP(Cart c) {
        List<Item> list = c.getItems();
        for (Item l : list) {
            if (l.getQuantity() > l.getProduct().getQuantity()) {
                return false;
            }
        }
        return true;
    }
}
