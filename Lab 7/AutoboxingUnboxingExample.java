public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        
        Integer intObj = 42; 
        Double doubleObj = 3.14;
        Boolean boolObj = true; 

        
        int intPrimitive = intObj;
        double doublePrimitive = doubleObj;
        boolean boolPrimitive = boolObj; 

        
        System.out.println("Autoboxing:");
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Boolean Object: " + boolObj);

        System.out.println("\nUnboxing:");
        System.out.println("int Primitive: " + intPrimitive);
        System.out.println("double Primitive: " + doublePrimitive);
        System.out.println("boolean Primitive: " + boolPrimitive);

      
        calculateSum(10, 20); 
    }

    public static void calculateSum(Integer a, Integer b) {

        Integer sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
