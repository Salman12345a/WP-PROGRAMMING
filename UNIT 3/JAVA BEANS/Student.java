import java.io.*;
public class Student implements Serializable 
{ 
	private int id; 
	private String name; 

	public Student()     //no argument constructor
    	{ 
    	} 
	public void setId(int id)      //setter method
    	{ 
        		this.id = id; 
    	} 
	public int getId()            //getter method
    	{ 
        		return id; 
    	} 
	public void setName(String name) 
    	{ 
        		this.name = name; 
    	} 
	public String getName() 
    	{ 
        		return name; 
    	} 
}