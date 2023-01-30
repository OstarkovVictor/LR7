package ex1;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("передал в конструктор суперклаcca");
        String className = superClassObject.toString();
        System.out.println(className);
        SubClassTest subClass0bject1 =
                new SubClassTest("передал в конструктор подкласса");
        String subClassName = subClass0bject1.toString();
        System.out.println(subClassName);
        SubClassTest subClass0bject2 =
                new SubClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClass0bject2.toString();
        System.out.println(subClassName2);
    }}