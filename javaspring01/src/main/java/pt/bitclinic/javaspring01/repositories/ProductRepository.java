package pt.bitclinic.javaspring01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.javaspring01.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
