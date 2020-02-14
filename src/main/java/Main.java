public class Main{

    public static void main(String[] args) {
        //Instantiating
        GenericsClass<String> stringInstance=new GenericsClass<>();
        GenericsClass<Integer> IntegerInstance=new GenericsClass<>();
        //This an Array that takes any data type
        Object [] Array =new Object[]{12,324,7900,"My","name","is","Gift","Moshobane"};

        stringInstance.setT("Test");
        stringInstance.getT();

        IntegerInstance.setT(1000);
        IntegerInstance.getT();

        GenericMethod.printArrayContent(Array);






    }


}
