package org.nagarro.productservices.repositories;

import org.nagarro.productservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Product, Integer> {
}
