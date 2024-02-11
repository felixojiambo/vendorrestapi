package com.zep.vendorapi.repository;

import com.zep.vendorapi.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Vendor,String>{

}
