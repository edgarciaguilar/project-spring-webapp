package com.project_spring_webapp.dao.impl;

import org.springframework.stereotype.Repository;

import com.project_spring_webapp.dao.EmpleadoDAO;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Edgar Garcia Aguilar";
	}

}
