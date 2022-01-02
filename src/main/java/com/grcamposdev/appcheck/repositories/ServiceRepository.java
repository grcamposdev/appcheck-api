package com.grcamposdev.appcheck.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grcamposdev.appcheck.domain.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {

}
