package net.nvsoftware.iProductServivce.repository;

import net.nvsoftware.iProductServivce.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}
