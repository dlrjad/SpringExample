package request;

import springexample.interfaces.IRequests;

public class OptionSub implements IRequests{

    @Override
    public void requestResult() {
        System.out.println("Resultado de la resta: ");
    }
    
}
