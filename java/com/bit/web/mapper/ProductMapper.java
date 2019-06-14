package com.bit.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.web.domain.ProductDTO;


/**
 * EmpoyeeMapper
 * 
 * @param <ProductDTO>
 */
@Repository
public interface ProductMapper {
    public void addEmpoyee(ProductDTO Product);
    public List<ProductDTO> selectProducts(ProductDTO Product);
    public List<ProductDTO> selectProductsByOption(ProductDTO Product);
    public ProductDTO selectProductBProductId(ProductDTO Product);
    public void updateProduct(ProductDTO Product);
    public void deleteProduct(ProductDTO Product);

    
}