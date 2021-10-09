package com.liabrary.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Entity
@Table(name="USER")
public class User {
	
	@Id
	private String userid;
	
	//personal details
	
	@NotBlank(message="name can not be blank")
	@Size(min=3, max=20, message="name must contain 3-20 characters")
	private String name;
	
	@Column(unique=true)
	@NotBlank(message="email can not be blank")
	@Pattern(regexp="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message="")
	private String email;
	
	@Column(unique=true)
	@NotBlank(message="mobile no can not be blank")
	@Size(min=10, max=10, message="put a valid mobile number")
	@Pattern(regexp="(^$|[0-9]{10})", message="")
	private String mobile;
	
	
	private String gender;
	private String image;
	private String address;
	
	//security details
	private String role;
	
	@NotBlank(message="password can not be blank")
	private String password;
	@Transient
	private String confirmpassword;
	private String activity;
	
	//social profiles and contact details
	private String facebook;
	private String instagram;
	private String website;
	private String whatsapp;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(String userid, String name, String email, String mobile, String gender, String image, String address,
			String role, String password, String confirmpassword, String activity, String facebook, String instagram,
			String website, String whatsapp) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.image = image;
		this.address = address;
		this.role = role;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.activity = activity;
		this.facebook = facebook;
		this.instagram = instagram;
		this.website = website;
		this.whatsapp = whatsapp;
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmpassword() {
		return confirmpassword;
	}



	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}



	public String getActivity() {
		return activity;
	}



	public void setActivity(String activity) {
		this.activity = activity;
	}



	public String getFacebook() {
		return facebook;
	}



	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}



	public String getInstagram() {
		return instagram;
	}



	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	public String getWhatsapp() {
		return whatsapp;
	}



	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}



	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", image=" + image + ", address=" + address + ", role=" + role + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + ", activity=" + activity + ", facebook=" + facebook
				+ ", instagram=" + instagram + ", website=" + website + ", whatsapp=" + whatsapp + "]";
	}
	
	
	
	
	

}
