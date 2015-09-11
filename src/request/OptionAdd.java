package request;

import springexample.interfaces.IRequests;

public class OptionAdd implements IRequests{

    @Override
    public void requestResult() {
        System.out.println("Resultado de la suma:");
    }
    
}
