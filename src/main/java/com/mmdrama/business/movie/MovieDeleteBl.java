package com.mmdrama.business.movie;

import com.mmdrama.core.business.BusinessLogic;
import com.mmdrama.dao.MovieDao;
import com.mmdrama.dao.entity.Movie;

public class MovieDeleteBl extends BusinessLogic {

	private MovieDao dao;
	private String uuid;
	
	public MovieDeleteBl()
	{
		dao=new MovieDao(getEntityManager());
		
	}
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Movie m=dao.getMovieById(uuid);
		dao.delete(m);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
