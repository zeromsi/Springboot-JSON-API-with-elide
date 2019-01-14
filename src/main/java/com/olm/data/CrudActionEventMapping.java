package com.olm.data;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;


@Entity
@Table(name="crudActionEventMapping")
@NamedQueries({
@NamedQuery(name="CrudActionEventMapping.findAll", query="SELECT p FROM CrudActionEventMapping p"),
})
public class CrudActionEventMapping implements Serializable {
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
	private State state;
	private CrudActionEvent crudActionEvent;
	private Role Role;
	
	public CrudActionEventMapping() {
		
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
	@JoinColumn(name="stateId", nullable=false)
	@JsonBackReference
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	@ManyToOne
	@JoinColumn(name="crudActionEventId", nullable=false)
	@JsonBackReference
	public CrudActionEvent getCrudActionEvent() {
		return crudActionEvent;
	}
	public void setCrudActionEvent(CrudActionEvent crudActionEvent) {
		this.crudActionEvent = crudActionEvent;
	}
	
	@ManyToOne
	@JoinColumn(name="roleId", nullable=false)
	@JsonBackReference
	public Role getRole() {
		return Role;
	}
	public void setRole(Role role) {
		Role = role;
	}
	
}