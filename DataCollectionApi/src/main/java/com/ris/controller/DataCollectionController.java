/**
 * 
 */
package com.ris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ris.service.IDataCollectionService;

/**
 * @author Agarw
 *
 */
@RestController
public class DataCollectionController {

	@Autowired
	private IDataCollectionService service;
	
	@GetMapping("/createCaseNumber/{appId}")
	public String getCaseNumberbyAppId(@PathVariable Long appId) {
		
		Long caseNumber = service.createCaseForGivenAppId(appId);
		return "Case number for Given App Id is: "+ caseNumber;
		
	}
}
