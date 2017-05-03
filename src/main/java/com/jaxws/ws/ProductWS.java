package com.jaxws.ws;

import com.jaxws.entities.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by krishna1bhat on 5/2/17.
 */

@WebService
public interface ProductWS {
    @WebMethod
    public Product find();

    @WebMethod
    public List<Product> findAll();
}
