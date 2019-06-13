package com.bit.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 * 
 * @param <SupplierDTO>
 */
@Component
public interface SupplierService<SupplierDTO> {
    public void addSupplier(SupplierDTO Supplier);
    public List<SupplierDTO> findSuppliers(SupplierDTO Supplier);
    public List<SupplierDTO> findSuppliersByOption(SupplierDTO Supplier);
    public SupplierDTO findSupplierBSupplierId(SupplierDTO Supplier);
    public void updateSupplier(SupplierDTO Supplier);
    public void deleteSupplier(SupplierDTO Supplier);
    
    
}

// CustomerService cs = new CustomerServiceImpl()
// type정리