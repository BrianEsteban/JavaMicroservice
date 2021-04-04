package com.GyT.models.services;

import java.util.List;

import com.GyT.models.entity.envios;


public interface IServiciosEnvios {
	
	public List<envios> listar(); 
	public void registro(envios x); 
	public boolean existe(int id_envio);

}
