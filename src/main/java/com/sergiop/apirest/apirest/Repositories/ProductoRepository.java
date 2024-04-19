package com.sergiop.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiop.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
