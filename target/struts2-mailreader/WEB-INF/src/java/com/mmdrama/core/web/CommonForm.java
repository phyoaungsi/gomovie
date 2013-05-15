package com.mmdrama.core.web;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.mmdrama.core.dao.CommonEntity;

public abstract class CommonForm {
	
	public abstract void convertFormToDao(CommonForm f);
	public abstract void convertDaoToFrom(CommonEntity ent);
public void reset(){
		
		Method[] methods=this.getClass().getMethods();
		Method setter;
		for(Method m:methods)
		{
			setter=m;
				
				
				String setterName=setter.getName();
				
				if(setterName.contains("set") && m.getParameterTypes().length==1)
				{
			
			
				//getter always null 
				Object o=new Object();;
				try {
					Class<?>[] c=m.getParameterTypes();
					
					
							//Class.forName(c[0].getName()).getConstructor().newInstance(o);
				Object[] args=new Object[1];
				args[0]=null;
				
				if(c[0].getName().equals("int"))
				{
					args[0]=0;
				}
				else if(c[0].getName().equals("boolean"))
				{
					args[0]=false;
				}
				
							m.invoke(this, args);
							
				} catch (IllegalArgumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		
		}
		
	}
	
	}
	
	protected void setAllFields(CommonEntity e)
	{
	   
		Method[] methods=CommonEntity.class.getMethods();
		Method getter,setter;
		for(Method m:methods)
		{
			getter=m;
				Class<?> type=getter.getReturnType();
				
				String getterName=getter.getName();
				
				String setterName=getterName.replace("get", "set");
				//getter always null 
				Object o;
				try {
					o = getter.invoke(e);
				
					setter=CommonForm.class.getMethod(setterName, type);
				
					setter.invoke(this, o);
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalArgumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchMethodException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		}
	}

}
