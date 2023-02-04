/**
 * 
 */
package com.ris.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ris.entity.PlanSelection;

/**
 * @author Agarw
 *
 */
public interface EducationDetailsRepo extends JpaRepository<PlanSelection, Long> {

}
