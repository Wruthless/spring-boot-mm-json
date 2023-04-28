package org.wruthless.json.springbootmmjson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wruthless.json.model.ShippingAddress;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {
        return new ShippingAddress();
    }

}
