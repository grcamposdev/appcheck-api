package com.grcamposdev.appcheck.domain;

import java.util.Objects;

public class Service {

	private Integer id;
	private String name;

	private Server server;

	public Service() {
		super();
	}

	public Service(Integer id, String name, Server server) {
		super();
		this.id = id;
		this.name = name;
		this.server = server;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Service other = (Service) obj;
		return Objects.equals(id, other.id);
	}

}
