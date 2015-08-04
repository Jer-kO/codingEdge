package Tests;


import org.junit.Test;
import exercises5.BlankNameException;
import exercises5.InvalidDayException;
import exercises5.InvalidMonthException;
import exercises5.InvalidPriorityException;
import exercises5.NameNotUniqueException;
import exercises5.Task;
import exercises5.TodoList;


public class Exercises5Test {

	@Test(expected=BlankNameException.class)
	public void setNameTest() throws BlankNameException {
		new Task("");
	}
	
	@Test(expected=InvalidPriorityException.class)
	public void setPriorityInvalidTest() throws BlankNameException, InvalidPriorityException {
		Task task = new Task("Test");
		task.setPriority("invalid");
	}
	
	@Test(expected=InvalidMonthException.class)
	public void setMonthInvalidTest() throws BlankNameException, InvalidMonthException {
		Task task = new Task("Test");
		task.setDueMonth("invalid");
	}
	
	@Test(expected=InvalidDayException.class)
	public void setDayInvalidTest() throws BlankNameException, InvalidDayException {
		Task task = new Task("Test");
		task.setDueDay("invalid");
	}
	
	@Test(expected=NameNotUniqueException.class)
	public void nameNotUniqueTest() throws NameNotUniqueException, InvalidPriorityException, InvalidMonthException, InvalidDayException, BlankNameException {
		TodoList todoList = new TodoList();
		
		todoList.addTask("Test", "0", "January", "1");
		todoList.addTask("Test", "0", "January", "1");
	}
}
