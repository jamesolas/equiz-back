package com.equiz.project.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table (name = "question")
public class Question {
	
	@Id
	@Column
	private long id;
	
	@Column(nullable = false)
	private String question;
	
	@Column
	private String answer1;
	
	@Column
	private String answer2;
	
	@Column
	private String answer3;
	
	@Column
	private String answer4;
	
	@Column(nullable = false)
	private String answer;
	
	@Column
	private String name;
	
	@Column
	private String series;
	
	@Column
	private String link;
	
	@Column
	private String mlink;
	
	

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Question(long id, String question, String answer1, String answer2, String answer3, String answer4,
			String answer, String name, String series, String link, String mlink) {
		super();
		this.id = id;
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer = answer;
		this.name = name;
		this.series = series;
		this.link = link;
		this.mlink = mlink;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getAnswer1() {
		return answer1;
	}



	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}



	public String getAnswer2() {
		return answer2;
	}



	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}



	public String getAnswer3() {
		return answer3;
	}



	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}



	public String getAnswer4() {
		return answer4;
	}



	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSeries() {
		return series;
	}



	public void setSeries(String series) {
		this.series = series;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}



	public String getMlink() {
		return mlink;
	}



	public void setMlink(String mlink) {
		this.mlink = mlink;
	}



	@Override
	public int hashCode() {
		return Objects.hash(answer, answer1, answer2, answer3, answer4, id, link, mlink, name, question, series);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return Objects.equals(answer, other.answer) && Objects.equals(answer1, other.answer1)
				&& Objects.equals(answer2, other.answer2) && Objects.equals(answer3, other.answer3)
				&& Objects.equals(answer4, other.answer4) && id == other.id && Objects.equals(link, other.link)
				&& Objects.equals(mlink, other.mlink) && Objects.equals(name, other.name)
				&& Objects.equals(question, other.question) && Objects.equals(series, other.series);
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answer1=" + answer1 + ", answer2=" + answer2
				+ ", answer3=" + answer3 + ", answer4=" + answer4 + ", answer=" + answer + ", name=" + name
				+ ", series=" + series + ", link=" + link + ", mlink=" + mlink + "]";
	}



		
	

	
	
	
	

}
