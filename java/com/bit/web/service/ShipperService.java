package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.ShipperDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface ShipperService {
    public void addEmpoyee(ShipperDTO Shipper);
    public List<ShipperDTO> findShippers(ShipperDTO Shipper);
    public List<ShipperDTO> findShippersByOption(ShipperDTO Shipper);
    public ShipperDTO findShipperBShipperId(ShipperDTO Shipper);
    public void updateShipper(ShipperDTO Shipper);
    public void deleteShipper(ShipperDTO Shipper);
    
    
}

// CustomerService cs = new CustomerServiceImpl()
// type정리