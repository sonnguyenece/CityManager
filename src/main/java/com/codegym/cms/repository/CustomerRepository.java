package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Pageable;


public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>{
    Iterable<Customer> findAllByProvince(Province province);
//    Iterable<Customer> findAllByFirstName();

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
