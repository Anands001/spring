package com.sam.crud.CrudRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.crud.CrudEntity.Employee;
@Repository
public interface CrudDbmanage extends JpaRepository<Employee, Long>
{

}
