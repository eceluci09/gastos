package com.gastos.gastos22.bo;

import com.gastos.gastos22.entities.Usuario;
import com.gastos.gastos22.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBOImpl implements UserBO{
    
    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public void login(Usuario user) {
        usuarioRepository.insert(user);
    }
}
