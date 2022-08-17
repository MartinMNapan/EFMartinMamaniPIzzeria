package pe.idat.edu.EFMartinMamaniPizzeria.service;

import java.util.List;

import pe.idat.edu.EFMartinMamaniPizzeria.model.Pizzeria;

public interface PizzeriaService {
	

 	List<Pizzeria> listar();
	Pizzeria obtenerId(Integer id);
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);	


}
