package exercises5;

@SuppressWarnings("serial")
public class NameNotUniqueException extends Exception {
	
	public NameNotUniqueException() { 
		super();
	}
	
	public NameNotUniqueException(String message) {
		super(message);
	}

}
