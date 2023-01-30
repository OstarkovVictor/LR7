package ex4;
import com.sun.source.util.SourcePositions;
public class Main {

        public static void main(String[] args) {
            //super Class test
            SuperClass superClassTest = new SuperClass('A');
            String className1 = superClassTest.toString();
            System.out.println(className1);
            //super Class copy test
            SuperClass superClassTestCopy = new SuperClass(superClassTest);
            String className1copy = superClassTestCopy.toString();
            System.out.println(className1copy);
            //1 subClass test
            SubClass1 FirstSubClassTest = new SubClass1('A',"AA");
            String className2 = FirstSubClassTest.toString();
            System.out.println(className2);
            //1 subClass copy test
            SubClass1 FirstSubClassTestCopy = new SubClass1(FirstSubClassTest);
            String className2Copy = FirstSubClassTestCopy.toString();
            System.out.println(className2Copy);
            //2 subClass test
            SubClass2 SecondSubClassTest = new SubClass2('A',"AA",123);
            String className3 = SecondSubClassTest.toString();
            System.out.println(className3);
            //2 subClass copy test
            SubClass2 SecondSubClassTestCopy = new SubClass2(SecondSubClassTest);
            String className3Copy = SecondSubClassTestCopy.toString();
            System.out.println(className3Copy);
        }
    }

