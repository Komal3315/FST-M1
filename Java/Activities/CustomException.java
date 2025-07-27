package activities;

public class CustomException extends Exception{
	private String message = null;
	
	 CustomException() {
		// TODO Auto-generated constructor stub
		 this.message = message;
	}
	 
	 @Override
	 public String getMessage() {
	     return message;
	 }
}
