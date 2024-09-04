public class Main6 {
    public static void main(String[] args) {
        // Create an instance of OuterClass6
        OuterClass6 outerObj = new OuterClass6(10);

        // Create an instance of InnerClass
        OuterClass6.InnerClass innerObj = new OuterClass6.InnerClass(20);

        // Access methods of both OuterClass6 and InnerClass
        outerObj.outerMethod();
        innerObj.innerMethod();
    }
}
