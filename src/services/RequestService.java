package services;

import springexample.interfaces.IRequests;

public class RequestService {
    
    private IRequests request;
    
    public void requestOption(){
        request.requestResult();
    }
    
    public void setRequest(IRequests request){
        this.request = request;
    }
    
}
