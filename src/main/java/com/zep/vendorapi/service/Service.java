package com.zep.vendorapi.service;

import com.zep.vendorapi.model.Vendor;

import java.util.List;

public interface Service {
    public String createCloudVendor(Vendor cloudVendor);
    public  String updateCloudVendor(Vendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public  Vendor getCloudVendor(String vendorId);
    public List<Vendor> getAllCloudVendor();
}
