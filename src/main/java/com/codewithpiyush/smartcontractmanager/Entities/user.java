package com.codewithpiyush.smartcontractmanager.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private Integer userId;
	
	@Column(name = "user_name",length = 100,nullable = false)
	@NotBlank(message = "Name cannot be blank!")
	@Size(min = 3,max = 99, message = "Name's Length can be between 3-99")
	private String name;
	
	@Column(name="email",length = 100,nullable = false,unique = true)
	@NotBlank(message = "E-Mail cannot be blank")
	@Email(message = "Please Enter email in correct Format!")
	private String email;
	
	@Column(name="password",length = 100,nullable = false)
	@NotBlank(message = "Password cannot be Blank!")
	@Size(min = 3,max = 15, message = "Password Length can be between 3-15")
	private String password;
	
	private String imageUrl;
	
	private String about;
	
	private String role;
	
	private boolean enabled;
	
}
