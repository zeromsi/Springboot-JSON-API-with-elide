package com.olm.data;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


@Entity
@Table(name="edge")
@NamedQueries({
@NamedQuery(name="Edge.findAll", query="SELECT p FROM Edge p"),
})
public class Edge implements Serializable {
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
	private State startState;
	private State endState;
	private ActionEvent actionEvent;
	private List<Role> mRoles;
	public Edge() {
		
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
	@JoinColumn(name="classTypeId", nullable=false)
	@JsonBackReference
	public ClassType getClassType() {
		return classtype;
	}

	public void setClassType(ClassType mClassType) {
		this.classtype = mClassType;
	}

	@ManyToOne
	@JoinColumn(name="startStateId", nullable=false)
	@JsonBackReference
	public State getStartState() {
		return startState;
	}

	public void setStartState(State startState) {
		this.startState = startState;
	}

	@ManyToOne
	@JoinColumn(name="endStateId", nullable=false)
	@JsonBackReference
	public State getEndState() {
		return endState;
	}

	public void setEndState(State endState) {
		this.endState = endState;
	}
	
	@ManyToOne
	@JoinColumn(name="actionEventId", nullable=false)
	@JsonBackReference
	public ActionEvent getActionEvent() {
		return actionEvent;
	}

	public void setActionEvent(ActionEvent mActionEvent) {
		this.actionEvent = actionEvent;
	}

	@ManyToMany
	//@JoinTable(name = "olcmm_edgeRole", joinColumns = @JoinColumn(name = "edgeId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	@JsonManagedReference
	public List<Role> getRoles() {
		return mRoles;
	}

	public void setRoles(List<Role> mRoles) {
		this.mRoles = mRoles;
	}


}