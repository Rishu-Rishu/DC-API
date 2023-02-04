package com.ris.entity;

import java.io.Serializable;

import javax.persistence.Id;

public class CompositeKey implements Serializable {
	private Long caseNumber;
	private Long kidSsn;
}
