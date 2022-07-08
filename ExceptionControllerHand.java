package com.cg.exceptioncontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.ofr.exception.FlatNotFoundException;

public class ExceptionControllerHand {
	@ControllerAdvice
	public class FlatExceptionController {
		@ExceptionHandler(value=FlatNotFoundException.class)
		public ResponseEntity<Object>FlatCodeExceptionHandler(Exception ex){

			  return new ResponseEntity("Update Flat Not Found",HttpStatus.NOT_FOUND);
			  }
		@ExceptionHandler(value=FlatNotFoundException.class)
		public ResponseEntity<Object>FlatCodeExceptionHandler1(Exception ex){

			  return new ResponseEntity("Delete Flat Not Found",HttpStatus.NOT_FOUND);
			  }
		@ExceptionHandler(value=FlatNotFoundException.class)
		public ResponseEntity<Object>ViewFlatCodeExceptionHandler2(Exception ex){

			  return new ResponseEntity("View Flat Not Found",HttpStatus.NOT_FOUND);
			  }
		
		@ExceptionHandler(value=FlatBookingNotFoundException.class)
		public ResponseEntity<Object>FlatBookingCodeExceptionHandler3(Exception ex){

			  return new ResponseEntity("Update FlatBooking Not Found",HttpStatus.NOT_FOUND);
			  }
		
		@ExceptionHandler(value=FlatBookingNotFoundException.class)
		public ResponseEntity<Object>FlatBookingCodeExceptionHandler4(Exception ex){

			  return new ResponseEntity("Delete FlatBooking Not Found",HttpStatus.NOT_FOUND);
			  }
		
		@ExceptionHandler(value=FlatBookingNotFoundException.class)
		public ResponseEntity<Object>FlatBookingCodeExceptionHandler5(Exception ex){

			  return new ResponseEntity("View FlatBooking Not Found",HttpStatus.NOT_FOUND);
			  }
		@ExceptionHandler(value=TenantNotFoundException.class)
	    public ResponseEntity<Object> tenantCodeExceptionHandler6(Exception ex) {
	        return new ResponseEntity("Update Tenant Not Found" ,HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(value=TenantNotFoundException.class)
	    public ResponseEntity<Object> tenantCodeExceptionHandler7(Exception ex) {
	        return new ResponseEntity("Delete Tenant Not Found" ,HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(value=TenantNotFoundException.class)
	    public ResponseEntity<Object> tenantCodeExceptionHandler8(Exception ex) {
	        return new ResponseEntity("View Tenant Not Found" ,HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(value=LandLordNotFoundException.class)
	    public ResponseEntity<Object> LandLordCodeExceptionHandler9(Exception ex) {
	        return new ResponseEntity("Update LandLord Not Found" ,HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(value=LandLordNotFoundException.class)
	    public ResponseEntity<Object> LandLordCodeExceptionHandler10(Exception ex) {
	        return new ResponseEntity("Delete LandLord Not Found" ,HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(value=LandLordNotFoundException.class)
	    public ResponseEntity<Object> LandLordCodeExceptionHandler11(Exception ex) {
	        return new ResponseEntity("View LandLord Not Found" ,HttpStatus.NOT_FOUND);
	    }
	    
	    @ExceptionHandler(value=UserNotFoundException.class)
	    public ResponseEntity<Object> userCodeExceptionHandler12(Exception ex) {
	        return new ResponseEntity("Update User Not Found" ,HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(value=UserNotFoundException.class)
	    public ResponseEntity<Object> userCodeExceptionHandler13(Exception ex) {
	        return new ResponseEntity("Delete User Not Found" ,HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(value=UserNotFoundException.class)
	    public ResponseEntity<Object> UserCodeExceptionHandler14(Exception ex) {
	        return new ResponseEntity("View User Not Found" ,HttpStatus.NOT_FOUND);
	    }



	}
}



