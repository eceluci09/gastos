package com.gastos.gastos22.repository;

import com.gastos.gastos22.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
