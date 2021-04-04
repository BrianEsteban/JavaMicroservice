package com.GyT.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GyT.models.entity.envios;

@Repository
public interface repoEnvios extends CrudRepository<envios, Long>  {

}
