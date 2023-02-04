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
@Table(name="INCOME_DETAILS")
public class IncomeDetails {

	@Id
	private Long caseNumber;
	private Double monthlySalIncome;
	private Double rentIncome;
	private Double propertyIncome;
}
