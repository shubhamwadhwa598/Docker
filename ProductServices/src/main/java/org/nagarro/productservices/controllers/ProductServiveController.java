package org.nagarro.productservices.controllers;


import org.nagarro.productservices.dao.ProductDao;
import org.nagarro.productservices.entities.Product;
import org.nagarro.productservices.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/product")
public class ProductServiveController {

    @Autowired
    private ProductDao productDao;

    @Autowired
    public org.nagarro.productservices.repositories.Repo Repo;

    @GetMapping("/getProducts")
    public List<Product> getAllProducts(){

        List<Product> list = productDao.getAllProdcuts();
        return list;
    }

    @GetMapping("/getProductById/{id}")
    public Optional<Product> getParticularProdicy(@PathVariable Integer id) throws ProductNotFoundException{

        Optional<Product> product = productDao.getProductById(id);
        if(!product.isPresent()){
            throw new ProductNotFoundException();
        }
        return product;

    }
}
