package org.rits;

import org.bikes.Pulser200Rs;
import org.bikes.RoyalEnfiled;
import org.bikes.YamahaR15;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext  =
    			new AnnotationConfigApplicationContext(ApplConfig.class); 
    	
    	Pulser200Rs pulser = (Pulser200Rs) applicationContext.getBean(Pulser200Rs.class);
    	pulser.doShowDetails();
    	System.out.println(pulser.hashCode());
    	
    	RoyalEnfiled enfiled = (RoyalEnfiled) applicationContext.getBean(RoyalEnfiled.class);
    	enfiled.doShowDetails();
   	 System.out.println(enfiled.hashCode());
    	YamahaR15 r15 = (YamahaR15) applicationContext.getBean(YamahaR15.class);
    	r15.doShowDetails();
    	
    	RoyalEnfiled enfiled1 = (RoyalEnfiled) applicationContext.getBean(RoyalEnfiled.class);
    	 System.out.println(enfiled1.hashCode());
    	 
    	 Pulser200Rs pulser2 = (Pulser200Rs) applicationContext.getBean(Pulser200Rs.class);
     	 System.out.println(pulser2.hashCode());
    	
        
    	
    }
}
