public class FirstClass {
    private String strMessage;

    public FirstClass(){
        strMessage = "Welcome to Java Application.";
    }
    public void print(){
        System.out.println(strMessage);
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.print();
    }
}
