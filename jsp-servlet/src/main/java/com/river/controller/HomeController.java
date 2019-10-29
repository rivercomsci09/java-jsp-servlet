package com.river.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.river.service.AccountService;

@WebServlet(urlPatterns = {"/h", "/h.html", "/h.jsp","/h.php"})
public class HomeController extends HttpServlet{
	@Inject
	private AccountService accountService;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		request.setAttribute("accounts", accountService.findAllAccount());
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/home.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	}
}
