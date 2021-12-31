package com.lnt.hotal.room.service.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;


@MappedSuperclass
public class HotalBase implements Serializable{
	
	private static final long serialVersionUID = 521119654844302830L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "created")
	private Date created = new Date();

	@Column(name = "updated")
	private Date updated = new Date();

	@Column(name = "enabled")
	private boolean enabled = true;

	@PrePersist
	void prePersist() {
		setCreated(new Date());
		setUpdated(new Date());
	}

	@PreUpdate
	void preUpdate() {
		setUpdated(new Date());

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}



}
