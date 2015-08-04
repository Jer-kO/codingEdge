package exercises5;


/* A Task that can be added to your Todo List.
 * 
 * */
public class Task {

	// Fields
	private String name;
	private int priority;
	private String dueMonth;
	private int dueDay;
	
	// Constructors
	public Task(String name) throws BlankNameException {
		this.setName(name);
		this.priority = 0;
		this.dueMonth = "January";
		this.dueDay = 1;
	}
	
	public Task(String name, String priority, String dueMonth, String dueDay) 
			throws InvalidPriorityException, InvalidMonthException, InvalidDayException, BlankNameException {
		this.setName(name);
		this.setPriority(priority);
		this.setDueMonth(dueMonth);
		this.setDueDay(dueDay);
	}

	// Methods
	public String getName() {
		return name;
	}

	public void setName(String name) throws BlankNameException {
		if (name.equals("")) {
			throw new BlankNameException();
		}
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	// TODO
	/* Given an integer, set the this tasks priority to this value. If the given priority
	 * is negative, throw an InvalidPriorityException
	 * */
	public void setPriority(int priority) throws InvalidPriorityException {
		if (priority < 0) {
			throw new InvalidPriorityException();
		}
		this.priority = priority;
	}
	
	public void setPriority(String priority) throws InvalidPriorityException {
		int priorityInt;
		try {
			priorityInt = Integer.parseInt(priority);
		} catch (NumberFormatException e) {
			throw new InvalidPriorityException();
		}
		this.setPriority(priorityInt);
	}

	public String getDueMonth() {
		return dueMonth;
	}

	// TODO
	/* Given a string, */
	public void setDueMonth(String dueMonth) throws InvalidMonthException {
		dueMonth = dueMonth.toLowerCase();
		if (dueMonth.equals("1") || dueMonth.equals("jan") || dueMonth.equals("january")) {
			this.dueMonth = "January";
		} else if (dueMonth.equals("2") || dueMonth.equals("feb") || dueMonth.equals("february")) {
			this.dueMonth = "February";
		} else if (dueMonth.equals("3") || dueMonth.equals("mar") || dueMonth.equals("march")) {
			this.dueMonth = "March";
		} else if (dueMonth.equals("4") || dueMonth.equals("apr") || dueMonth.equals("april")) {
			this.dueMonth = "April";
		} else if (dueMonth.equals("5") || dueMonth.equals("may")) {
			this.dueMonth = "May";
		} else if (dueMonth.equals("6") || dueMonth.equals("jun") || dueMonth.equals("june")) {
			this.dueMonth = "June";
		} else if (dueMonth.equals("7") || dueMonth.equals("jul") || dueMonth.equals("july")) {
			this.dueMonth = "July";
		} else if (dueMonth.equals("8") || dueMonth.equals("aug") || dueMonth.equals("august")) {
			this.dueMonth = "August";
		} else if (dueMonth.equals("9") || dueMonth.equals("sep") || dueMonth.equals("september")) {
			this.dueMonth = "September";
		} else if (dueMonth.equals("10") || dueMonth.equals("oct") || dueMonth.equals("october")) {
			this.dueMonth = "October";
		} else if (dueMonth.equals("11") || dueMonth.equals("nov") || dueMonth.equals("november")) {
			this.dueMonth = "November";
		} else if (dueMonth.equals("12") || dueMonth.equals("dec") || dueMonth.equals("december")) {
			this.dueMonth = "December";
		} else {
			throw new InvalidMonthException();
		}
	}

	public int getDueDay() {
		return dueDay;
	}

	// TODO
	public void setDueDay(int dueDay) throws InvalidDayException {
		if (dueDay < 1) {
			throw new InvalidDayException();
		}
		switch(dueDay) {
	        case 1:
	        	if (dueDay > 31) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 2: 
	        	if (dueDay > 28) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 3: 
		        if (dueDay > 31) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 4:
	        	if (dueDay > 30) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 5:
	        	if (dueDay > 31) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 6:
	        	if (dueDay > 30) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 7:
	        	if (dueDay > 31) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 8:
        		if (dueDay > 31) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 9: 
	        	if (dueDay > 30) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 10: 
	        	if (dueDay > 31) {
		        	throw new InvalidDayException();
		        }
		        break;   
	        case 11:
	        	if (dueDay > 30) {
		        	throw new InvalidDayException();
		        }
		        break;
	        case 12: 
	        	if (dueDay > 31) {
		        	throw new InvalidDayException();
		        }
		        break;
		}
		this.dueDay = dueDay;
	}
	
	public void setDueDay(String dueDay) throws InvalidDayException {
		int dayInt;
		try {
			dayInt = Integer.parseInt(dueDay);
		} catch (NumberFormatException e) {
			throw new InvalidDayException();
		}
		this.setDueDay(dayInt);
	}
}
