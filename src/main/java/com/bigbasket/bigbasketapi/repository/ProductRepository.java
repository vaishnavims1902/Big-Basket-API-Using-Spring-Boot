package com.bigbasket.bigbasketapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigbasket.bigbasketapi.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Integer> {

    List<ProductModel> getAllProductBycategoryId(int id);

    List<ProductModel> findAllBycategoryId(int id);

    
}
