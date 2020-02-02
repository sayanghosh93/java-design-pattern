public class SingleObject{
    private static final SingleObject INSTANCE = null;
    
    private SingleObject() {

    }

    public static SingleObject getInstance() {
        if (INSTANCE == null) {
            return new SingleObject();
        } else {
            return INSTANCE;
        }
    }

    public void showMessage() {
        System.out.println("Current instace of this class is: " + INSTANCE.hashCode());
    }
}