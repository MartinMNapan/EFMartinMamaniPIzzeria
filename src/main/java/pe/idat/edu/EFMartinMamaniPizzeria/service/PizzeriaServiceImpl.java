package pe.idat.edu.EFMartinMamaniPizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.EFMartinMamaniPizzeria.model.Pizzeria;
import pe.idat.edu.EFMartinMamaniPizzeria.repository.PIzzeriaRepository;
@Service
public class PizzeriaServiceImpl implements PizzeriaService {
	
	@Autowired
	private PIzzeriaRepository repository;

	@Override
	public List<Pizzeria> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Pizzeria obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizzeria pizzeria) {
		// TODO Auto-generated method stub
		repository.save(pizzeria);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Pizzeria pizzeria) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(pizzeria);

	}

}
