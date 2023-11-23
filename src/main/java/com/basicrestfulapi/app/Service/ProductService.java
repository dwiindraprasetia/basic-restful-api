package com.basicrestfulapi.app.Service;

import com.basicrestfulapi.app.Model.Entity.Product;
import com.basicrestfulapi.app.Model.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product buatAtauUpdate(Product product) {
        return productRepository.save(product);
    }

    public Product cari(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    public Iterable<Product> cariSemua() {
        return productRepository.findAll();
    }

    public void hapus(Long id) {
        productRepository.deleteById(id);
    }
}
