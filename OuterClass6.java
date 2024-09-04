class OuterClass6 {
    
    private static int outerData;
    
    // Constructor for OuterClass6
    public OuterClass6(int data) {
        outerData = data;
    }

    // Method in OuterClass6
    public void outerMethod() {
        System.out.println("Outer Method");
    }


    // Static nested class
    static class InnerClass {
        private int innerData;

        // Constructor for InnerClass
        public InnerClass(int data) {
            innerData = data;
        }

        // Method in InnerClass
        public void innerMethod() {
            System.out.println("Inner Method");
            System.out.println("Outer data: " + outerData);
            System.out.println("Inner data: " + innerData);
        
        }
 
    }
}


