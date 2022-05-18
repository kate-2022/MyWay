package Five.TwoTwo.MyWay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App  {
		
    public static void main( String[] args ) {
     
        ApplicationContext context = new ClassPathXmlApplicationContext("Jobs.xml");
        
        FascinatingWorkable perfectJob = (FascinatingWorkable)context.getBean("javaDevelopment");
        perfectJob.doWhatYouLove();
    	
       
    	
    	
    }
}
