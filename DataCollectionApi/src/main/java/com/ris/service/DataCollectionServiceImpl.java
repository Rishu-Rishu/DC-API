/**
 * 
 */
package com.ris.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ris.entity.AppRegistartion;
import com.ris.repo.RegistartionRepo;

/**
 * @author Agarw
 *
 */
@Service
public class DataCollectionServiceImpl implements IDataCollectionService {
	
	@Autowired
	private RegistartionRepo registartionRepo;
	
	@Override
	public Long createCaseForGivenAppId(Long AppId) {
		
		Optional<AppRegistartion> opt = registartionRepo.findById(AppId);
		
		if(opt.isPresent()) {
			return (Long)opt.get().getAppId();
		}else {
			return null;
		}
	}

}
