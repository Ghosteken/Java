class OuterClass {
    private int outerData;

    // Constructor for OuterClass
    public OuterClass(int data) {
        outerData = data;
    }

    // Method in OuterClass
    public void outerMethod() {
        System.out.println("Outer Method");
    }

    // Nested class
    class InnerClass {
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
