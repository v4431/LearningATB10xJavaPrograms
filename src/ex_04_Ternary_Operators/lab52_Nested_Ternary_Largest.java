package ex_04_Ternary_Operators;

public class lab52_Nested_Ternary_Largest {
    public static void main(String[] args) {
        int a=110;
        int b=110;
        int c=30;
        String large = a>b ? "A is largest" : (b>c ? "B is largest" : "C is Largest");
        System.out.println(large);
    }
}
