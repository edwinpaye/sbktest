package com.example.demo.repo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

import com.example.demo.model.Customer

@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {

	fun findByLastName(lastName: String): Iterable<Customer>

    //fun findOne(id: Long): Customer
    //<S extends T> S save(S entity); //for @RequestMapping("/save")
    //T findOne(ID id); //for @RequestMapping("/findbyid")
    //Iterable<T> findAll(); //for @RequestMapping("/findall")
}