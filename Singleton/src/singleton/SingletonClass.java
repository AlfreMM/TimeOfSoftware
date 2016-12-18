package singleton;
public class SingletonClass 
{
    private static SingletonClass _singletonClass;
    
    private String CadenaTexto;    
    
    private SingletonClass(){}    
    
    public static SingletonClass GetInstance()
    {
        if(_singletonClass==null) 
        	_singletonClass = new SingletonClass();
        return _singletonClass;
    }    
    
    public String getCadenaTexto() 
    { 
    	return CadenaTexto; 
	}
    
    public void setCadenaTexto(String CadenaTexto) 
    {
    	this.CadenaTexto = CadenaTexto; 
	}
}


