package services;

import springexample.interfaces.IRequests;

public class RequestService {
    
    private IRequests request;
    
    public void requestOption(){
        request.requestResult();
    }
    
    public void setOption(IRequests request){
        this.request = request;
    }
    
}
