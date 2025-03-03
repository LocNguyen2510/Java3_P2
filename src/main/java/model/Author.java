package model;

import java.sql.Date;

import javax.persistence.Id;

public class Author {
	@Id
	private String author_id;
	private String author_name;
	private Date dateOfBirth;

	public Author() {
		super();
	}

	public Author(String author_id, String author_name, Date dateOfBirth) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
