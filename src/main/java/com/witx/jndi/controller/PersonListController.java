package com.witx.jndi.controller;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.witx.jndi.bean.FirstBean;

@WebServlet(name="PersonList",urlPatterns={"/PersonList"})
public class PersonListController extends HttpServlet{

	/**
	 * 序列化的版本号
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		FirstBean fBean = new FirstBean();
		try {
			Context initCtx =  new InitialContext();
			Context envCtx = (Context)initCtx.lookup("java:comp/env");
			fBean = (FirstBean) envCtx.lookup("bean/FirstBean");
			System.out.println(fBean.toString());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.getWriter().append("对javabean的处理:"+fBean.toString());
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	
	
}
