/**
 * 
 */
package com.ris.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ris.entity.IncomeDetails;

/**
 * @author Agarw
 *
 */
public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails, Long> {

}
