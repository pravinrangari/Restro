package tech.codehunt.service;

import java.time.LocalDateTime;

import tech.codehunt.dao.ContactDaoImpl;

public class ContactServiceImpl implements ContactService {

	private static String result;

	public String ContactService1(String name, String email, String subject, String message) {
		try {
			// You can add validation here if needed later
			result = contactValidationImpl(name, email, subject, message);
		} catch (Exception e) {
			result = "SERVICE ERROR";
			e.printStackTrace();
		}
		return result;
	}

	private static String contactValidationImpl(String name, String email, String subject, String message) {
		try {
			String dateTime = LocalDateTime.now().toString();
			ContactDaoImpl contactDaoImpl = new ContactDaoImpl();
			result = contactDaoImpl.saveContact(name, email, subject, message, dateTime);
		} catch (Exception e) {
			result = "SERVICE ERROR";
			e.printStackTrace();
		}
		System.out.println(result); // for debugging
		return result;
	}

	@Override
	public String ContactService2(String name, String email, String subject, String message) {
		return null;
	}

	public String deleteService(String sn) {
		return null;
	}
}
