package com.platform.mvc.station;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.platform.mvc.base.BaseValidator;

public class StationValidator extends BaseValidator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(StationValidator.class);

	@SuppressWarnings("unused")
	private StationService stationService;
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/station/save")){
			
		} else if (actionKey.equals("/station/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Station.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/station/save")){
			
		} else if (actionKey.equals("/station/update")){
			
		}
	}
}
