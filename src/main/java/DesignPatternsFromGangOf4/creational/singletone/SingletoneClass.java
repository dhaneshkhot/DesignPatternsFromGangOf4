package DesignPatternsFromGangOf4.creational.singletone;

public class SingletoneClass {

    // if object was created here, it would have called eagerly loading
    // Note that object is private so that it's not accessible outside this class
    // 'volatile' here makes sure the object remains singletone throughout any changes in JVM
    private static volatile SingletoneClass instance = null;


    // Note that constructor is private so that it is only callable from within this class only
    private SingletoneClass() {
        // This is to make sure even if Reflection is used it should not create the instance hence it is singletone
        if(instance != null) {
            throw new RuntimeException("Use getInstance() Method to get the instance object");
        }
    }

    public static SingletoneClass getInstance() {
        // here object is initialised only once making sure there is only one instance at a time
        // this is to make sure object is lazily loaded for better performance
        if (instance == null) {

            // Rather than synchronizing?? whole method, check if instance is null only then synchronize for better performance
            synchronized (SingletoneClass.class) {
                if(instance == null){
                    instance = new SingletoneClass();
                }
            }
        }
        return  instance;
    }


}
