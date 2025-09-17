package br.ufscar.dc.dsw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufscar.dc.dsw.dao.IConsultaDAO;
import br.ufscar.dc.dsw.domain.Consulta;
import br.ufscar.dc.dsw.domain.Medico;
import br.ufscar.dc.dsw.domain.Paciente;
import br.ufscar.dc.dsw.service.spec.IConsultaService;

@Service
@Transactional(readOnly = false)
public class ConsultaService implements IConsultaService {
	
	@Autowired
	IConsultaDAO dao;
	
	@Cacheable(value = "consultasPorId", key = "#id")
	public Consulta buscarPorId(long id) {
		return dao.findById(id);
	}
	
	@Cacheable(value = "consultasPorMedico", key = "#medico.id")
	public List<Consulta> buscarPorMedico(Medico medico) {
		return dao.findByMedico(medico);
	}
	
	@Cacheable(value = "consultasPorPaciente", key = "#paciente.id")
	public List<Consulta> buscarPorPaciente(Paciente paciente) {
		return dao.findByPaciente(paciente);
	}
	
	@Cacheable(value = "consultasPorData", key = "#data")
	public List<Consulta> buscarPorData(String data) {
		return dao.findByData(data);
	}

	@CacheEvict(value = { "consultas", "consultasPorId", "consultasPorMedico", "consultasPorPaciente", "consultasPorData" }, allEntries = true)
	public void salvar(Consulta consulta) {
		dao.save(consulta);
	}

	public void doingSomething1(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething2(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething3(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething4(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething5(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething6(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething7(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething8(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething9(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	public void doingSomething10(Consulta consulta1, Consulta consulta2) {
		System.out.println("doing something");
	}

	@Transactional(readOnly = true)
	@Cacheable("consultas")
	public List<Consulta> buscarTodos() {
		return dao.findAll();
	}

}
