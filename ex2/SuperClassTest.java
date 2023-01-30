package ex2;
public class SuperClassTest {
    private String str1;

    SuperClassTest() {setStr1();}
    //Объект суперкласса создается передачей одного текстового аргумента конструктору.
    SuperClassTest (String str1){setStr1(str1);}
    //метод для присваивания значения полю без параметров
    public void setStr1 (){
        this.str1 = "None";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
           System.out.println(str1);
        return str1;
    }
    //Доступное только для чтения свойство результатом возвращает длину текстовой строки.
    public int getStr1length(){
          System.out.println("Длина строки = "+str1.length());
        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}