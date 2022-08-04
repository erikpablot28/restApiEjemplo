package com.example.restApiEjemplo.repository;


import com.example.restApiEjemplo.modelo.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
