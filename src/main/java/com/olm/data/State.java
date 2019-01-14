package com.olm.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * The persistent class for the child database table.
 * 
 */
@Entity
@Table(name = "state")
@NamedQuery(name = "State.findAll", query = "SELECT c FROM State c")
public class State implements Serializable {
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
	private ClassType classtype;
	private List<Edge> startEdges;
	private List<Edge> endEdges;
	private List<CrudActionEventMapping> crudActionEventMappings;
	
	public State() {
	}

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

	@ManyToOne
	@JoinColumn(name = "classTypeId", nullable = false)
	@JsonBackReference
	public ClassType getClassType() {
		return classtype;
	}

	public void setClassType(ClassType mClassType) {
		this.classtype = mClassType;
	}

	@OneToMany(mappedBy = "startState")
	@JsonManagedReference
	public List<Edge> getStartEdges() {
		return startEdges;
	}

	public void setStartEdges(List<Edge> startEdges) {
		this.startEdges = startEdges;
	}

	@OneToMany(mappedBy = "endState")
	@JsonManagedReference
	public List<Edge> getEndEdges() {
		return endEdges;
	}

	public void setEndEdges(List<Edge> endEdges) {
		this.endEdges = endEdges;
	}

	@OneToMany(mappedBy = "state")
	@JsonManagedReference
	public List<CrudActionEventMapping> getCrudActionEventMappings() {
		return crudActionEventMappings;
	}

	public void setCrudActionEventMappings(List<CrudActionEventMapping> crudActionEventMappings) {
		this.crudActionEventMappings = crudActionEventMappings;
	}
	
	

}
