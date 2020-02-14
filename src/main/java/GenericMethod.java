public class GenericMethod {


    public static <T> void printArrayContent(T[] Array) {

        //for each loop
        for(T input:Array){

            System.out.println(input);

        }

    }
}
