package com.appranch.appranch.repository;

import com.appranch.appranch.documents.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuarios, Integer> {
}
