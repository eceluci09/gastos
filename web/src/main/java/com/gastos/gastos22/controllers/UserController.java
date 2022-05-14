package com.gastos.gastos22.controllers;

import com.gastos.gastos22.bo.UserBO;
import com.gastos.gastos22.entities.Usuario;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
public class UserController {

    private static final Logger LOGGER = getLogger(UserController.class);
    
    @Autowired
    UserBO userBO;
    
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public void login(@RequestBody Usuario usuario) {
        
        userBO.login(usuario);
        
    }
}
