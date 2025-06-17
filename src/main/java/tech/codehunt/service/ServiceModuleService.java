package tech.codehunt.service;

import java.util.ArrayList;

import tech.codehunt.model.ServiceModulePojo;

public interface ServiceModuleService {

	public String validateService(String iconname,String title,String description);
	public String addService(String iconname,String title,String description);
	public 	ArrayList<ServiceModulePojo> readService();
	public 	ArrayList<ServiceModulePojo> readFourService();
	public 	String deleteService(String sn);


}