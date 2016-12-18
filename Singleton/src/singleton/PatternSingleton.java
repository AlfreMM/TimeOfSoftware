package singleton;
public class PatternSingleton 
{
    public static void main(String[] args) 
    {
        SingletonClass _singleInstance = SingletonClass.GetInstance();
        _singleInstance.setCadenaTexto("Cadena 1");
        System.out.println("Cadena inicial: " + _singleInstance.getCadenaTexto());
        
        SingletonClass _otherInstance = SingletonClass.GetInstance();
        System.out.println("Cadena inicial: " + _otherInstance.getCadenaTexto());
        _otherInstance.setCadenaTexto("Cadena 2");
        
        System.out.println("Cadena final: " + _singleInstance.getCadenaTexto());
        System.out.println("Cadena final: " + _otherInstance.getCadenaTexto());
    }    
}




