package com.example.test.Responses;

public class EmployeeResponse {
		
	    private String id;
	    private String name;
	    private String email;
	  

	    // Constructor
	    public EmployeeResponse(String id, String name, String email) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	    }

	    // Getters
	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	   
	}

