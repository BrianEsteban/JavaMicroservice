package com.GyT.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GyT.models.entity.envios;
import com.GyT.models.repository.repoEnvios;

@Service
public class ServiciosEnviosImplementados implements IServiciosEnvios{
	@Autowired
	private repoEnvios repo_envios;
	
	@Override
	public List<envios> listar() {
		return (List<envios>) repo_envios.findAll();
	}

	@Override
	public void registro(envios envio) {
		repo_envios.save(envio);
	}

	@Override
	public boolean existe(int id_envio) {
		boolean existe = false;
		List<envios> list = (List<envios>) repo_envios.findAll();
		for(int i = 0; i< list.size(); i++){
			if(list.get(i).getIdenvios() == id_envio){
				existe = true;
			}
		}
		return existe;
	}

}
