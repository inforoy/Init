package com.bank.credit.controller;

import com.bank.credit.model.AppSessionData;
import com.bank.credit.model.jpa.Persona;
import com.bank.credit.service.PersonaService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class PrincipalController extends AbstractController{

	@Autowired
	Environment environment;

	@Autowired
	private PersonaService personaService;

	@RequestMapping(value="/main.htm", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String datos = environment.getProperty("app.datos");
		ModelAndView view = new ModelAndView("Main");

		view.addObject("razonSocial", "eCredits SAC");
		view.addObject("usuario", "Harry Potter");
		view.addObject("numeroMensajes", 14);
		view.addObject("empresa", "eCredit");

		AppSessionData app = new AppSessionData();
		app.setEmpresa("eCredit");
		app.setUsuario("Harry Potter");
		app.setRazonSocial("eCredits SAC");
		app.setNumeroMensajes(14);

		// subir datos a session
		List<Persona> data = personaService.findAll();
		request.getSession().setAttribute("datosEnSession", app);

		return view;
	}

}