package com.mmdrama.web.model.maintain.movie;

import java.io.File;
import java.math.BigDecimal;

import com.mmdrama.core.dao.CommonEntity;
import com.mmdrama.core.dao.Dao;
import com.mmdrama.core.web.CommonForm;
import com.mmdrama.dao.MovieDao;
import com.mmdrama.dao.entity.Movie;

public class MaintainMovie extends CommonForm {
	
	private String name,embed,desc,map,uploadfileName,uuid;
	private BigDecimal latitude,longitude;
	private int zoomlevel;
	private File upload;
	private boolean featured;
	private int rank;
	private String backgroundImage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmbed() {
		return embed;
	}

	public void setEmbed(String embed) {
		this.embed = embed;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public String getUploadFileName() {
		return uploadfileName;
	}

	public File getUpload() {
		return upload;
	}

	public void setUploadFileName(String uploadfileName) {
		this.uploadfileName = uploadfileName;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public int getZoomlevel() {
		return zoomlevel;
	}

	public void setZoomlevel(int zoomlevel) {
		this.zoomlevel = zoomlevel;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public boolean isFeatured() {
		// TODO Auto-generated method stub
		return featured;
	}
	public void setFeatured(boolean flag) {
		// TODO Auto-generated method stub
		this.featured=flag;
	}

	public int getRank() {
		// TODO Auto-generated method stub
		return rank;
	}
	
	public int setRank(int rank) {
		// TODO Auto-generated method stub
		return this.rank=rank;
	}

	public String getBackgroundImage() {
		// TODO Auto-generated method stub
		return this.backgroundImage;
	}
	
	public void setBackgroundImage(String url) {
		// TODO Auto-generated method stub
		 this.backgroundImage=url;
	}
	
	

	@Override
	public void convertFormToDao(CommonForm f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void convertDaoToFrom(CommonEntity ent) {
		// TODO Auto-generated method stub
		Movie dao=(Movie) ent;
		this.setBackgroundImage(dao.getBackgroundImage());
		this.setDesc(dao.getDescription());
		this.setEmbed(dao.getEmbed());
		this.setFeatured(dao.isFeatured());
		this.setLatitude(dao.getMap().getLattitude());
		this.setLongitude(dao.getMap().getLongitude());
		this.setName(dao.getTitle());
		this.setRank(dao.getRank());
		this.setZoomlevel(dao.getMap().getZoomLevel());
		
		
	}
	
	

}
