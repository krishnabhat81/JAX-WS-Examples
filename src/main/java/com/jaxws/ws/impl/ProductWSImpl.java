package com.jaxws.ws.impl;

import com.jaxws.dao.ProductDAO;
import com.jaxws.entities.Product;
import com.jaxws.ws.ProductWS;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by krishna1bhat on 5/2/17.
 */

@WebService(endpointInterface = "com.jaxws.ws.ProductWS")
public class ProductWSImpl implements ProductWS {

    private ProductDAO productDAO = new ProductDAO();

    @Override
    public Product find() {
        return productDAO.findOne();
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }
}
