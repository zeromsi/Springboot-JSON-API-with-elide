package com.olm.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "actionEvent")
@NamedQuery(name = "ActionEvent.findAll", query = "SELECT c FROM ActionEvent c")
public class ActionEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long mId;
	private String mName;
	private String mCode;
	private String mDescribtion;
	private String mCreatedBy;
	private Long mCreatedAt;
	private Long mLastUpdatedAt;
	private String mLastUpdatedBy;
	private String mComments;
	private String mExtra;
	private List<Edge> mEdges;
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return mId;
	}

	public void setId(Long mId) {
		this.mId = mId;
	}

	@NotNull
	@Column(name = "name")
	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	@NotNull
	@Column(name = "code")
	public String getCode() {
		return mCode;
	}

	public void setCode(String mCode) {
		this.mCode = mCode;
	}

	@NotNull
	@Column(name = "describtion")
	public String getDescribtion() {
		return mDescribtion;
	}

	public void setDescribtion(String mDescribtion) {
		this.mDescribtion = mDescribtion;
	}

	@NotNull
	@Column(name = "createdBy")
	public String getCreatedBy() {
		return mCreatedBy;
	}

	public void setCreatedBy(String mCreatedBy) {
		this.mCreatedBy = mCreatedBy;
	}

	@NotNull
	@Column(name = "createdAt")
	public Long getCreatedAt() {
		return mCreatedAt;
	}

	public void setCreatedAt(Long mCreatedAt) {
		this.mCreatedAt = mCreatedAt;
	}

	@NotNull
	@Column(name = "lastUpdatedAt")
	public Long getLastUpdatedAt() {
		return mLastUpdatedAt;
	}

	public void setLastUpdatedAt(Long mLastUpdatedAt) {
		this.mLastUpdatedAt = mLastUpdatedAt;
	}

	@NotNull
	@Column(name = "lastUpdatedBy")
	public String getLastUpdatedBy() {
		return mLastUpdatedBy;
	}

	public void setLastUpdatedBy(String mLastUpdatedBy) {
		this.mLastUpdatedBy = mLastUpdatedBy;
	}

	@NotNull
	@Column(name = "comments")
	public String getComments() {
		return mComments;
	}

	public void setComments(String mComments) {
		this.mComments = mComments;
	}

	@NotNull
	@Column(name = "extra")
	public String getExtra() {
		return mExtra;
	}

	public void setExtra(String mExtra) {
		this.mExtra = mExtra;
	}
	
	@OneToMany(mappedBy = "actionEvent")
	@JsonManagedReference
	public List<Edge> getEdge() {
		return this.mEdges;
	}

	public void setEdge(List<Edge> mEdges) {
		this.mEdges = mEdges;
	}
	
	public ActionEvent() {
		// TODO Auto-generated constructor stub
	}
	

}