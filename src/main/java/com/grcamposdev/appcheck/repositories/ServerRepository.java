package com.grcamposdev.appcheck.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grcamposdev.appcheck.domain.Server;

@Repository
public interface ServerRepository extends JpaRepository<Server, Integer>{

}
