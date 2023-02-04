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
@Table(name="PLAN_SELECT_INFO")
public class PlanSelection {

	@Id
	private Long caseNumber;
	private Long AppId;
	private String planName;
}
