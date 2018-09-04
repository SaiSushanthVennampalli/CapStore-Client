package com.cg.capstore.beans;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedbackProductBean {

	private Integer feedbackId;

	private String feedbackTitle;

	private Date date;

	private Integer rating;

	public Integer getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackTitle() {
		return feedbackTitle;
	}

	public void setFeedbackTitle(String feedbackTitle) {
		this.feedbackTitle = feedbackTitle;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FeedbackProductBean [feedbackId=" + feedbackId + ", feedbackTitle=" + feedbackTitle + ", date=" + date
				+ ", rating=" + rating + "]";
	}

	public FeedbackProductBean(Integer feedbackId, String feedbackTitle, Date date, Integer rating) {
		super();
		this.feedbackId = feedbackId;
		this.feedbackTitle = feedbackTitle;
		this.date = date;
		this.rating = rating;
	}

	public FeedbackProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}