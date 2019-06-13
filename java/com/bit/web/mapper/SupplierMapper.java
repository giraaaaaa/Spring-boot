package com.bit.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * EmpoyeeMapper
 * 
 * @param <SupplierDTO>
 */
@Repository
public interface SupplierMapper<SupplierDTO> {
    public void addSupplier(SupplierDTO Supplier);
    public List<SupplierDTO> selectSuppliers(SupplierDTO Supplier);
    public List<SupplierDTO> selectSuppliersByOption(SupplierDTO Supplier);
    public SupplierDTO selectSupplierBSupplierId(SupplierDTO Supplier);
    public void updateSupplier(SupplierDTO Supplier);
    public void deleteSupplier(SupplierDTO Supplier);

    
}