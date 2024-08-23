package net.engineeringdigest.journalApp.entity;

import org.springframework.boot.web.codec.CodecCustomizer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private Integer mobNo;
    private String fName;
    private String lName;
    private Integer age;

    Map<Integer, Customer> mp = new HashMap<>();

    @PostMapping("/postCustomer")
    public Map<Integer, Customer> postRequest(@RequestBody Customer c)
    {

        return mp;
    }


}
