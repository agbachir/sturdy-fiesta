package cnss.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cnss.models.Employe;
import cnss.repositories.EmployeRepository;
import cnss.services.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
    private EmployeRepository employeRepository;
	
	@Override
	public List<Employe> findByNom(String nom) {
		// TODO Auto-generated method stub
		return employeRepository.findByNom(nom);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

}
