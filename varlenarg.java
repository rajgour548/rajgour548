import java.util.Arrays;
public class varlenarg {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
        fun("raj","anurag","raghav","aman");
        //function overloading in java is when the function is created with same name and same return type but their argument(parameter)type is different or no of argument is different 
    }
    static void fun(int ...v){//create a array of integer that can store n no of integer
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...name){// create an array of string that can store n no of strings
System.out.println(Arrays.toString(name));
    }
}
