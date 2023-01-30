package ex1;

public class SuperClassTest{

private String str1;

        SuperClassTest(String strEx){
        this.str1 = strEx;}
        SuperClassTest() {}
//@0verride - аннотация указываемая для того,
// чтобы покозать что далее мы собираемся
// переопределять метод суперкласса 1 override
@Override
public String toString() {
    String superClassNameAndFieldValue;
    superClassNameAndFieldValue = "super" + "\n" +
            " Class name: " + this.getClass().getSimpleName() + "\n" + " str 1 = " + this.getStr1();
    return superClassNameAndFieldValue;
}
public String getStr1() {
        return str1;}
public void setStr1(String str1) {
        this.str1 = str1;}}