package com.basicrestfulapi.app.Controller;

import com.basicrestfulapi.app.DTO.ResponseData;
import com.basicrestfulapi.app.Model.Entity.Product;
import com.basicrestfulapi.app.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ResponseData<Product>> buatAtauUpdate(@Valid @RequestBody Product product, Errors errors) {
        ResponseData<Product> responseData = new ResponseData<>();

        if(errors.hasErrors()) {
            for(ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        else {
            responseData.setStatus(true);
            responseData.setPayload(productService.buatAtauUpdate(product)); // ada kemungkinan error juga
            return ResponseEntity.ok(responseData);
        }
    }

    @PutMapping
    public ResponseEntity<ResponseData<Product>> update(@Valid @RequestBody Product product, Errors errors) {
        ResponseData<Product> responseData = new ResponseData<>();

        if(errors.hasErrors()) {
            for(ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        else {
            responseData.setStatus(true);
            responseData.setPayload(productService.buatAtauUpdate(product)); // ada kemungkinan error juga
            return ResponseEntity.ok(responseData);
        }
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
