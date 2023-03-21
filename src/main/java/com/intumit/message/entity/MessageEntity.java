package com.intumit.message.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NotNull
@Builder
@Table(name = "MESSAGE")
public class MessageEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "MESSAGE")
	private String message;

	@Column(name = "CREATOR")
	private String creator;

	@Column(name = "CREATE_TIME")
	private String createTime;

	@Column(name = "UPDATER")
	private String updater;

	@Column(name = "UPDATE_TIME")
	private String updateTime;
}
