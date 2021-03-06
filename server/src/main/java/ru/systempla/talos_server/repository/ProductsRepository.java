package ru.systempla.talos_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.Product;

import java.util.UUID;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
