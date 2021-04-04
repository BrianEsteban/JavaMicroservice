package com.GyT.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GyT.models.entity.envios;
import com.GyT.models.services.IServiciosEnvios;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
//@RequestMapping("/registroEnvios")
public class registroEnvios {
		
	@Autowired
	private IServiciosEnvios servicios_envios;
	
	@PostMapping
	@RequestMapping("/nuevo_registro")
	public String registro_de_envios (@RequestBody String entrada) throws JSONException
	{
		JSONObject object_JSON = new JSONObject();
		JSONObject info_envio = new JSONObject(entrada);
		envios envio = new envios();
			
			envio.setIdenvios(info_envio.getInt("idenvios"));
			envio.setProveedor(info_envio.getString("proveedor"));
			envio.setNombre_remitente(info_envio.getString("nombre_remitente"));
			envio.setCelular_remitente(info_envio.getString("celular_remitente"));
			envio.setNombre_destinatario(info_envio.getString("nombre_destinatario"));
			envio.setCelular_destinatario(info_envio.getString("celular_destinatario"));
			envio.setDireccion_destinatario(info_envio.getString("direccion_destinatario"));
			envio.setTipo_de_envio(info_envio.getString("tipo_de_envio"));
			envio.setPeso(info_envio.getInt("Peso"));
			envio.setCaracteristicas_envio(info_envio.getString("caracteristicas_envio"));
			envio.setCiudad_origen(info_envio.getString("ciudad_origen"));
			envio.setCiudad_destino(info_envio.getString("ciudad_destino"));
			envio.setForma_de_pago(info_envio.getString("forma_de_pago"));
			
		if(servicios_envios.existe(envio.getIdenvios())){
			object_JSON.put("respuesta","Id del envio ya existe");
		}else{
			servicios_envios.registro(envio);
			object_JSON.put("respuesta","Se agrego el envio al historial");
		
		}
		return object_JSON.toString();
	}
	
	@GetMapping
	public List<envios> listar (){
		return servicios_envios.listar();
	}
	

}