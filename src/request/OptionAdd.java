package request;

import springexample.interfaces.IRequests;

public class OptionAdd implements IRequests{

    @Override
    public void requestResult() {
        System.out.print("Resultado de la suma: ");
    }
    
}
