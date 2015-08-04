package exercises5;

@SuppressWarnings("serial")
public class BlankNameException extends Exception {
	
	public BlankNameException() { 
		super();
	}
	
	public BlankNameException(String message) {
		super(message);
	}

}
