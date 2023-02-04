/**
 * 
 */
package com.ris.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ris.entity.AppRegistartion;

/**
 * @author Agarw
 *
 */
public interface RegistartionRepo extends JpaRepository<AppRegistartion, Long> {

}
