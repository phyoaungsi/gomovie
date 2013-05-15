package com.mmdrama.web.actions.maintain;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.mmdrama.dao.entity.Movie;
import com.mmdrama.service.MovieService;
import com.mmdrama.web.actions.CommonAction;
import com.mmdrama.web.model.maintain.movie.MaintainMovie;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action
public class EditAction extends CommonAction implements ScopedModelDriven<MaintainMovie> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8913517218156131272L;
	private String uuid;
	private MaintainMovie model;
	public String execute()
	{
		
		MovieService svc=new MovieService();
		String id=model.getUuid();
		Movie m=svc.getMovieById(id);
		model.convertDaoToFrom(m);
		return INPUT;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public MaintainMovie getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}



	public void setModel(MaintainMovie model) {
		// TODO Auto-generated method stub
		this.model=model;
	}



}
