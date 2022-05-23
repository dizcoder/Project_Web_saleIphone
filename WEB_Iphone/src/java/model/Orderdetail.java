/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Orderdetail {
    private int oid;
    private int pid;
    private int quantity;
    private float productprice;

    public Orderdetail() {
    }

    public Orderdetail(int oid, int pid, int quantity, float productprice) {
        this.oid = oid;
        this.pid = pid;
        this.quantity = quantity;
        this.productprice = productprice;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getProductprice() {
        return productprice;
    }

    public void setProductprice(float productprice) {
        this.productprice = productprice;
    }

    
}
