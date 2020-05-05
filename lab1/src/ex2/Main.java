package ex2;

public class Main {

    public static void main(String[] args) {
        byte v_byte = 1;
        short v_short = 2;
        char v_char = 'a';
        int v_int = 4;
        long v_long = 5L;
        float v_float = 6f;
        double v_double = 7;
        boolean v_boolean = true;
        System.out.println(v_byte);
        System.out.println(v_short);
        System.out.println(v_char);
        System.out.println(v_int);
        System.out.println(v_long);
        System.out.println(v_float);
        System.out.println(v_double);
        System.out.println(v_boolean);

        v_byte = 120;
        v_short = 129;
//        v_char = a;
        v_char = 'a';
        v_int = 65999;
//        v_long = 4294967296;
        v_long = 4294967296L;
//        v_float = 0.33333334;
        v_float = 0.33333334f;
        v_double = 0.3333333333333333;
//        v_double=true;
        v_boolean = true;

        System.out.println(v_byte);
        System.out.println(v_short);
        System.out.println(v_char);
        System.out.println(v_int);
        System.out.println(v_long);
        System.out.println(v_float);
        System.out.println(v_double);
        System.out.println(v_boolean);
    }
}