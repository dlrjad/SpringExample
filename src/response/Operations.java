package response;

import springexample.interfaces.IOperations;

public class Operations implements IOperations{

    @Override
    public int suma(int x, int y) {
        return x+y;
    }

    @Override
    public int resta(int x, int y) {
        return x-y;
    }
    
}
