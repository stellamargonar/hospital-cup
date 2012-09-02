package it.margonar.webarch.ejb;

import javax.ejb.Remote;

@Remote
public interface UserRemote {
	public String getName();

	public String getPassword();

	public void setName(String name);

	public void setPassword(String password);

	public String toString();
}
