package springexample.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.OperationService;
import services.RequestService;

public class SpringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 10, y = 5;
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        RequestService requestService = (RequestService) context.getBean("addService");
        requestService.requestOption();
        
        OperationService operationService = (OperationService) context.getBean("operationAddService");
        int z = operationService.operationAdd(x, y);
        System.out.println(z);
        
        requestService = (RequestService) context.getBean("subService");
        requestService.requestOption();
        
        operationService = (OperationService) context.getBean("operationSubService");
        z = operationService.operationSub(x, y);
        System.out.println(z);
        
    }
    
}
