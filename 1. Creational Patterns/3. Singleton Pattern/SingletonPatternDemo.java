public class SingletonPatternDemo {
    public static void main(String[] args) {
        try {
            SingleObject obj1 = SingleObject.getInstance();
            obj1.showMessage();
            SingleObject obj2 = SingleObject.getInstance();
            obj2.showMessage();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}