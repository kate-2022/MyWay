
package Five.TwoTwo.MyWay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App  {
		
    public static void main( String[] args ) {
     
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
      //  FascinatingWorkable perfectJob = (FascinatingWorkable)context.getBean("javaDevelopment");
        
      //  perfectJob.doWhatYouLove();
    	
        JavaDevelopment iLike = context.getBean(JavaDevelopment.class);
        
        iLike.doWhatYouLove();
        
       ((AbstractApplicationContext) context).close();
    	
    }
}
