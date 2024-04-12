package com.example.day1_q4.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day1_q4.Model.Address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AddressController {
@GetMapping("/address")
public List<Address>addressDetails() {
    List<Address> li=new ArrayList<Address>();
    Address a=new Address();
    a.setName("Ram");
    a.setDoorNo(123);
    a.setStreetName("MainSt");
    a.setPincode(641308);
    a.setArea("CBE");
    a.setDistrict("Coimbatore");
    a.setState("Tamil Nadu");
    a.setCountry("Ind");
    li.add(a);
    return li;
}

}
