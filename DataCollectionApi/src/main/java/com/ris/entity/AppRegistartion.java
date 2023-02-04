/**
 * 
 */
package com.ris.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Agarw
 *
 */
@Data
@Entity
@Table(name="REGISTRATION_TBL")
public class AppRegistartion {

	@Id
	private Long appId;
	private String fullName;
	private String emailId;
	private Long mobileNumber;
	private String gender;
	private Date dob;
	private Long ssn;
}
