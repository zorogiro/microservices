package com.bugBusters.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bugBusters.model.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
