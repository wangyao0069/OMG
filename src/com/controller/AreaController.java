package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Area;
import com.service.AreaServiceI;


@Controller
@RequestMapping("areaController")
public class AreaController
{

	private AreaServiceI areaService;

	@Autowired
	public void setAreaService(AreaServiceI areaService)
	{
		this.areaService = areaService;
	}

	@RequestMapping("/addArea")
	public String addArea(Area area)
	{
		try
		{
			areaService.addArea(area);
			return "success";
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "error";
	}
}
