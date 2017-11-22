package com.krishna;

public class Client {

	private int id;
	private String name;
	private String email;

	public Client(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public void hello() {
		System.out.println("Hello" + " " + id + " " + name + " " + email);
	}
}
