package exceptionHandling;

public class ThrowThrowsDemo {
    public static void main(String[] args) throws Exception {
        int result = addnumbers(5,2);
        int result1 = dividenumbers(1 ,3);
        int result2 = substractnumbers(5,3);
        String nameresult = findname(null);

        System.out.println(nameresult);


//        System.out.println("result " + result);
//        System.out.println("result1 " + result1);
//        System.out.println("result2 " + result2);
    }
    private static int addnumbers(int a , int b ){
        if (a< 0 || b< 0){
            throw new RuntimeException(" please pass postiv numbers");

        }
        int c = a+ b;
        return c;
    }


//    handling by the try catch methods without the Throws key words;
    private static int dividenumbers(int a , int b ) {
        if (b< 0){
            try {
                throw new Exception("innput the number is the gretaer than the zero");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int c = a / b;
        return c;
    }


//    using the throws key word for the handling of the erroe in it
    private static int substractnumbers(int a , int b ) throws Exception {
        if (b< 0){
            throw new Exception("innput the number is the gretaer than the zero");
        }
        int c = a - b;
        return c;
    }

    private static String findname (String name) {
        if (name == null){
            throw new NullPointerException("name is not null input same text");
        }
        String [] n1 = name.split(" ");
        return n1[1];
    }

}
