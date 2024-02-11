package com.zep.vendorapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="cloud_vendor_infor")
public class Vendor {
    @Id
    private  String vendorId;
    private  String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public Vendor() {
    }

    public Vendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
