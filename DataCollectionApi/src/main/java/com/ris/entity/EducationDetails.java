/**
 * 
 */
package com.ris.entity;

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
@Table(name="EDUCATION_DTLS")
public class EducationDetails {

	@Id
	private Long caseNumber;
	private String highestDegree;
	private String year;
	private String universityName;
}
