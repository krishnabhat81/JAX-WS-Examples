package com.jaxws.dao;

import com.jaxws.entities.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna1bhat on 5/2/17.
 */
public class ProductDAO {
    public Product findOne(){
        return new Product("P001", "Laptop", 123);
    }

    public List<Product> findAll(){
        List<Product> result = new ArrayList<Product>();
        result.add(new Product("P002", "Fan", 34));
        result.add(new Product("P003", "Bag", 54));
        result.add(new Product("P004", "TV", 123));
        return result;
    }
}
