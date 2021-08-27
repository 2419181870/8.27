package com.cdut.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "article")
public class Article implements Serializable {
	@Id
	private int id;
	/**
	 * 文章Id(String) 文章作者(String) 文章标题(String) 文章发表时间(Date) 文章点击次数(int) 文章本体储存地址(String)
	 */
	@Column(name = "article_id")
	String article_id;
	@Column(name = "article_title")
	String article_title;
	@Column(name = "article_author")
	String article_author;
	@Column(name = "article_deliver_time")
	Date article_deliver_time;
	@Column(name = "article_hit_times")
	int article_hit_times;
	@Column(name = "article_content_position")
	String article_content_position;


	public Article(int id, String article_id, String article_title, String article_author, Date article_deliver_time, int article_hit_times,String article_content_position) {
		this.id = id;
		this.article_id = article_id;
		this.article_title = article_title;
		this.article_author = article_author;
		this.article_deliver_time = article_deliver_time;
		this.article_hit_times = article_hit_times;
		this.article_content_position=article_content_position;
	}
	public Article(){

	}
	public String getArticle_content_position() {
		return article_content_position;
	}

	public void setArticle_content_position(String article_content_position) {
		this.article_content_position = article_content_position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticle_id() {
		return article_id;
	}

	public void setArticle_id(String article_id) {
		this.article_id = article_id;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_author() {
		return article_author;
	}

	public void setArticle_author(String article_author) {
		this.article_author = article_author;
	}

	public Date getArticle_deliver_time() {
		return article_deliver_time;
	}

	public void setArticle_deliver_time(Date article_deliver_time) {
		this.article_deliver_time = article_deliver_time;
	}

	public int getArticle_hit_times() {
		return article_hit_times;
	}

	public void setArticle_hit_times(int article_hit_times) {
		this.article_hit_times = article_hit_times;
	}
}
