package com.basicrestfulapi.app.Model.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="tbl_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nama Produk gaboleh kosong")
    @Column(name = "nama_produk", length = 50)
    private String namaProduk;

    @NotEmpty(message = "Deskripsi Produk juga gaboleh kosong")
    @Column(name = "deskripsi_produk", length = 100)
    private String deskripsiProduk;

    private double harga;

    public Product() {

    }

    public Product(Long id, String namaProduk, String deskripsiProduk, double harga) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.harga = harga;
    }
}
