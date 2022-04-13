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
@Table(name = "contact")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	
	@Column(name = "user_name",length = 100,nullable = false)
	@NotBlank(message = "Name cannot be blank!")
	@Size(min = 3,max = 99, message = "Name's Length can be between 3-99")
	private String name;
	private String secondName;
	private String work;
	
	@Column(name="email",length = 100,nullable = false,unique = true)
	@NotBlank(message = "E-Mail cannot be blank")
	@Email(message = "Please Enter email in correct Format!")
	private String email;
	private String image;
	
	@Column(length = 5000)
	private String description;
	private String phone;
	
}
