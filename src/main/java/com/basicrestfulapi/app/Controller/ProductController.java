package com.basicrestfulapi.app.Controller;

import com.basicrestfulapi.app.Model.Entity.Product;
import com.basicrestfulapi.app.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product buatAtauUpdate(@RequestBody Product product) {
        return productService.buatAtauUpdate(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return buatAtauUpdate(product);
    }

    @GetMapping("/{id}")
    public Product cari(@PathVariable("id") Long id) {
        return productService.cari(id);
    }

    @GetMapping
    public Iterable<Product> cariSemua() {
        return productService.cariSemua();
    }

    @DeleteMapping("/{id}")
    public void hapus(@PathVariable("id") Long id) {
        productService.hapus(id);
    }
}
