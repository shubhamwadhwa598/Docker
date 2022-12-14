package org.nagarro.productservices.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @Column(name = "ID")
    private int productId;
    @Column(name = "NAME")
    private String productName;
    @Column(name = "SIZE")
    private String productSize;

    @Column(name = "PRICE")
    private int productPrice;
    @Column(name = "DESIGN")
    private String productDesign;

    public Product() {
    }

    public Product(int productId, String productName, String productSize, int productPrice, String productDesign) {
        this.productId = productId;
        this.productName = productName;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.productDesign = productDesign;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesign() {
        return productDesign;
    }

    public void setProductDesign(String productDesign) {
        this.productDesign = productDesign;
    }


}
