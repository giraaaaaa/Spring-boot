package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.ProductDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface ProductService {
    public void addEmpoyee(ProductDTO Product);
    public List<ProductDTO> findProducts(ProductDTO Product);
    public List<ProductDTO> findProductsByOption(ProductDTO Product);
    public ProductDTO findProductBProductId(ProductDTO Product);
    public void updateProduct(ProductDTO Product);
    public void deleteProduct(ProductDTO Product);
    
    
}

// CustomerService cs = new CustomerServiceImpl()
// type정리