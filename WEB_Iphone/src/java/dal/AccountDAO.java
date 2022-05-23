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
import model.Account;

/**
 *
 * @author Admin
 */
public class AccountDAO extends DBContext{
    public Account checkAccount(String acc, String pass) {
        String sql = "select * from Account where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, acc);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account getAccount(String acc, String pass) {
        String sql = "select * from Account where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, acc);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void insertAcc( String username, String password, String name, float amount ) {
        String sql = "INSERT INTO  Account VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setFloat(4, amount);
            
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Account> getAllAcc() {
        List<Account> list = new ArrayList<>();
        String sql = "select * from Account";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt(1));
                a.setUsername(rs.getString(2));
                a.setPassword(rs.getString(3));

                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public boolean checkIdAccExist(int id) {
        List<Account> list = getAllAcc();
        for (Account a : list) {
            if (a.getId()==id) {
                return true;
            }
        }
        return false;
    }
    
    public void updateAcc(int id, String acc, String pass, String name, float amount) {
        String sql = "update Account set username=?, password=?, name=?, amount=? where AccountID=? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, acc);
            ps.setString(2, pass);
            ps.setString(3, name);
            ps.setFloat(4, amount);
            ps.setInt(5, id);

            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Account getPass(int id, String acc, String email) {
        String sql = "select * from Account where username=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, acc);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Account(id, rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void deductionAcc(String u, double money) {
        String sql = "UPDATE Account SET amount= "+money+" WHERE username= '"+u+"' ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            System.out.println( e);
        }
    }
}
