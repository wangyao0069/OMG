package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AreaMapper;
import com.model.Area;


@Service("areaService")
public class AreaServiceImpl implements AreaServiceI
{

	private AreaMapper areaMapper;

	@Autowired
	public void setAreaMapper(AreaMapper areaMapper)
	{
		this.areaMapper = areaMapper;
	}

	@Override
	public Area getArea(Integer id)
	{
		return areaMapper.selectByPrimaryKey(id);
	}

	@Override
	public void addArea(Area area)
	{
		areaMapper.insertSelective(area);
	}

}
