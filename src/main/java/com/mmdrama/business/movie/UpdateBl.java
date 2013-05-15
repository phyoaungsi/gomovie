package com.mmdrama.business.movie;

import com.mmdrama.core.business.BusinessLogic;
import com.mmdrama.dao.MovieDao;
import com.mmdrama.dao.entity.Movie;

public class UpdateBl extends BusinessLogic {

	private MovieDao dao;
	private Movie movie;
	
	public UpdateBl()
	{
		 dao=new MovieDao(getEntityManager());
		
	}
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
		dao.update(this.movie);
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
