package com.example.cl.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cl.demo.BlzServiceAdapter;
import com.example.cl.demo.soapclient.DetailsType;
import com.example.cl.demo.soapclient.GetBankResponseType;
import com.example.cl.demo.soapclient.GetBankType;
import com.example.cl.demo.soapclient.ObjectFactory;

@RestController
@RequestMapping("/")
public class BlzController {

    @Autowired
    private BlzServiceAdapter blzServiceAdapter;

    @GetMapping
    public DetailsType sum(@RequestParam String code){
        ObjectFactory objectFactory = new ObjectFactory();
        GetBankType type = new GetBankType();
        type.setBlz(code);
        GetBankResponseType response =  blzServiceAdapter.getBank("http://www.thomas-bayer.com/axis2/services/BLZService", objectFactory.createGetBank(type));
        return response.getDetails();
    }
}