/**
 * 
 */
package com.ris.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Agarw
 *
 */
@Data
@Entity
@Table(name="KIDS_DTLS")
@IdClass(CompositeKey.class)
public class KidsDetails {

	@Id
	private Long caseNumber;
	@Id
	private Long kidSsn;
	
	private String kidName;
	private Integer kidAge;
}
