package ex5;

public class Main {
    public static void main(String[] args) {
        SuperClass SuperClassTest1 = new SuperClass("easy to test this");
        SuperClassTest1.PrintToString();

        SubClass1 SubClassTest1 = new SubClass1("Test 4 subclass", 123);
        SubClassTest1.PrintToString();

        SubClass2 SubClassTest2 = new SubClass2("Test 4 subclass again", 'A');
        SubClassTest2.PrintToString();

        SuperClass SuperClassTest2 = new SuperClass(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        SuperClass SuperClassTest3 = new SuperClass(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}
