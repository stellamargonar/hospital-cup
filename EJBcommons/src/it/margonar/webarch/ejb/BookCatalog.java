package it.margonar.webarch.ejb;

import it.margonar.webarch.entity.BookInterface;

import java.util.Collection;
import javax.ejb.Remote;

@Remote
public interface BookCatalog {

	public void addBook(int id, String title);

	public Collection<BookInterface> getAllBook();
}
