package com.bit.web.mapper;

import java.util.List;

import com.bit.web.domain.ShipperDTO;

import org.springframework.stereotype.Repository;

/**
 * EmpoyeeMapper
 */
@Repository
public interface ShipperMapper {
    public void addEmpoyee(ShipperDTO Shipper);
    public List<ShipperDTO> selectShippers(ShipperDTO Shipper);
    public List<ShipperDTO> selectShippersByOption(ShipperDTO Shipper);
    public ShipperDTO selectShipperBShipperId(ShipperDTO Shipper);
    public void updateShipper(ShipperDTO Shipper);
    public void deleteShipper(ShipperDTO Shipper);

    
}