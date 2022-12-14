package org.nagarro.productservices.dao;

import org.nagarro.productservices.entities.Product;
import org.nagarro.productservices.repositories.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDao {

    @Autowired
    private Repo repo;

    public List<Product> getAllProdcuts(){
        return repo.findAll();
    }

    public Optional<Product> getProductById(int id){
        return repo.findById(id);
    }


}
