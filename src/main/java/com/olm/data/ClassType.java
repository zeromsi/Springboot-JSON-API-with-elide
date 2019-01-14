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
@Table(name = "classType")
@NamedQuery(name = "ClassType.findAll", query = "SELECT c FROM ClassType c")
public class ClassType implements Serializable {
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
	private List<State> mStates;
	private List<Edge> mEdges;
	private List<CrudActionEventMapping> mCrudActionEventMappings;
	private String mDisplayName;

	public ClassType() {
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

	@OneToMany(mappedBy = "classType")
	@JsonManagedReference
	public List<State> getState() {
		return this.mStates;
	}

	public void setState(List<State> mStates) {
		this.mStates = mStates;
	}
	
	@OneToMany(mappedBy = "classType")
	@JsonManagedReference
	public List<Edge> getEdge() {
		return this.mEdges;
	}

	public void setEdge(List<Edge> mEdges) {
		this.mEdges = mEdges;
	}
	
	@OneToMany(mappedBy = "classType")
	@JsonManagedReference
	public List<CrudActionEventMapping> getCrudActionEventMapping() {
		return this.mCrudActionEventMappings;
	}

	public void setCrudActionEventMapping(List<CrudActionEventMapping> mCrudActionEventMappings) {
		this.mCrudActionEventMappings = mCrudActionEventMappings;
	}

	@NotNull
	@Column(name = "displayName")
	public String getDisplayName() {
		return mDisplayName;
	}

	public void setDisplayName(String mDisplayName) {
		this.mDisplayName = mDisplayName;
	}

	public Edge addEdge(Edge edge) {
		getEdge().add(edge);
		edge.setClassType(this);
		return edge;
	}

	public Edge removeEdge(Edge edge) {
		getEdge().remove(edge);
		edge.setClassType(null);
		return edge;
	}
	
	
	public CrudActionEventMapping addCrudActionEventMapping(CrudActionEventMapping crudActionEventMapping) {
		getCrudActionEventMapping().add(crudActionEventMapping);
		crudActionEventMapping.setClassType(this);
		return crudActionEventMapping;
	}

	public CrudActionEventMapping removeCrudActionEventMapping(CrudActionEventMapping crudActionEventMapping) {
		getCrudActionEventMapping().remove(crudActionEventMapping);
		crudActionEventMapping.setClassType(null);
		return crudActionEventMapping;
	}
	
	
	public State addState(State state) {
		getState().add(state);
		state.setClassType(this);
		return state;
	}

	public State removeState(State state) {
		getState().remove(state);
		state.setClassType(null);
		return state;
	}

}
