package services;

import springexample.interfaces.IOperations;

public class OperationService {
    
    private IOperations operation;
    
    public int operationAdd(int x, int y){
        return operation.suma(x, y);
    }
    
    public int operationSub(int x, int y){
        return operation.resta(x, y);
    }
    
    public void setOperation(IOperations operation){
        this.operation = operation;
    }

}
