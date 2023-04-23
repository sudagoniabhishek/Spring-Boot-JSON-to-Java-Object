package com.abhi.model;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo {

	public static void main(String[] args) {
try {
//	ObjectMapper objectMapper =new ObjectMapper();
//	String employeeJson="{\"name\":\"abhi\",\"city\":\"Hyderabad\",\"department\":\"Software\",\"designation\":\"Developer\"}";
//	JsonNode jsonNode=objectMapper.readTree(employeeJson);
//	
//	String empName=jsonNode.get("name").asText();
//	String empCity=jsonNode.get("city").asText();
//	String empDept=jsonNode.get("department").asText();
//	String empDesig=jsonNode.get("designation").asText();
//	
//	objectMapper.writeValue(new File("target/employeeNode.txt"),empName+","+empCity+","+empDept+","+empDesig);
//	
//	
	
	ObjectMapper mapper=new ObjectMapper();
	Employee employee=mapper.readValue(new File("target/emp.json"), Employee.class);
	System.out.println("employee object-->"+employee.getName());
	System.out.println("employee object-->"+employee.getCity());
	System.out.println("employee object-->"+employee.getDepartment());
	System.out.println("employee object-->"+employee.getDesignation());
}
catch(final Exception e) {
	e.printStackTrace();
}

	}

}



