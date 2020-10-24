package com.spring.training;

import org.springframework.stereotype.Component;

@Component
public class MassDrill implements DrillService {

	@Override
	public String getDrill() {
		return "This is Mass Drill";
	}
}
