package ex3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassTest = new SuperClass(123);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SubClass1 FirstSubClassTest = new SubClass1(321,'A');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        SubClass2 SecondSubClassTest = new SubClass2(123321,'А',"Строка");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}

