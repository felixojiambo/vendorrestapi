package com.zep.vendorapi.controller;

import com.zep.vendorapi.model.Vendor;
import com.zep.vendorapi.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")


public class VendorControlloer
{
    //Vendor cloudVendor;
    Service service;
    public VendorControlloer(Service service){
        this.service=service;
    }
    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(@PathVariable("vendorId")String vendorId){

    return  service.getCloudVendor(vendorId); //cloudVendor;//new Vendor("A1","Oracle 1","Address 1","xxxxxxx");
    }
    @GetMapping()
    public List<Vendor> getAllCloudVendorDetails(){

        return  service.getAllCloudVendor();
    }
   @PostMapping
    public  String createVendorDetails(@RequestBody Vendor cloudVendor){
       service.createCloudVendor(cloudVendor);
        return  "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public  String updateVendorDetails(@RequestBody Vendor cloudVendor){
        service.updateCloudVendor(cloudVendor);

        return  "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping
    public  String deleteVendorDetails(@PathVariable("vendorId") String  vendorId){
      service.deleteCloudVendor(vendorId);
        return  "Cloud Vendor deleted Successfully";
    }
}
