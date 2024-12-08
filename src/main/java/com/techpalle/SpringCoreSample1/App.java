package com.techpalle.SpringCoreSample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.techpalle.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
        /*
         * step 1:load my spring configuration field
         * step 2:get objects from the spring configuration file
         * step 3:print the objects data.
         */
    	
    	//step 1:load my spring configuration field
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//ClassPathXmlApplicationContext is a implementation class of
    	//ApplicationContext interface which is used to 
    	//load the specified spring configuration file
    	
    	//step 2:get objects from the spring configuration file
    	Student s=(Student) context.getBean("s2");
    	
    	//step 3:print the objects data.
   	    System.out.println(s.getSno());
    	System.out.println(s.getSname());
    	System.out.println(s.getCourse());
  
    	
    } 
    
    
}
