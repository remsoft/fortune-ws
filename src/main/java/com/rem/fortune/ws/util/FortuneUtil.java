package com.rem.fortune.ws.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class FortuneUtil {
	
	public static ResponseEntity generateWSResponse(int nRecordUpdated) {
	if(nRecordUpdated!=0)
		return new ResponseEntity<>(HttpStatus.OK);
	else
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
