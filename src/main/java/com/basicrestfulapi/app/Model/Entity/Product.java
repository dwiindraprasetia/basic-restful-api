package com.basicrestfulapi.app.Model.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tbl_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String namaProduk, deskripsiProduk;

    private double harga;

    public Product() {

    }

    public Product(Long id, String namaProduk, String deskripsiProduk, double harga) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.harga = harga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getDeskripsiProduk() {
        return deskripsiProduk;
    }

    public void setDeskripsiProduk(String deskripsiProduk) {
        this.deskripsiProduk = deskripsiProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
