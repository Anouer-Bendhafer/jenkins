package com.anouerdev.resto.Repository;

import com.anouerdev.resto.model.Tables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TablesRepository extends JpaRepository<Tables,Integer>{
    
}
