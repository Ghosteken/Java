public class Main3 {
    public static void main(String[] args) {
        // Create an instance of OuterClass
        OuterClass outerObj = new OuterClass(10);
        // for nested
        // Create an instance of InnerClass
        OuterClass.InnerClass innerObj = outerObj.new InnerClass(20);

        // Access methods of both OuterClass and InnerClass
        outerObj.outerMethod();
        innerObj.innerMethod();
    }
}
