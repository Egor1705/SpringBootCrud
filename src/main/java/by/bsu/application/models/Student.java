package by.bsu.application.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	@NotNull
	@Column(name = "firstname")
	public String firstname;

	@NotNull
	@Column(name = "surname")
	private String surname;

	@NotNull
	@Column(name = "score")
	private double averageScore;

	public Student() {

	}

	public Student(String firstname, String surname, double averageScore) {

		this.firstname = firstname;
		this.surname = surname;
		this.averageScore = averageScore;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

}
