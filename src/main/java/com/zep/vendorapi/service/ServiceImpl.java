package com.zep.vendorapi.service;

import com.zep.vendorapi.model.Vendor;
import com.zep.vendorapi.repository.Repository;


import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
 Repository repository;

 public  ServiceImpl(Repository repository){
     this.repository=repository;
 }
    @Override
    public String createCloudVendor(Vendor cloudVendor) {
        repository.save(cloudVendor);
        return  "Success";
    }

    @Override
    public String updateCloudVendor(Vendor cloudVendor) {
        repository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        repository.deleteById(vendorId);
        return "Deleted";
    }

    @Override
    public Vendor getCloudVendor(String vendorId) {

        return   repository.findById(vendorId).get();
    }

    @Override
    public List<Vendor> getAllCloudVendor() {
        return repository.findAll();
    }
}
