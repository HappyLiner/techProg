package ex3;

public class Main{

    public static void main(String[] args) {
        for(int i = (int) 'a'; i < (int) 'z' + 1; i++){
            System.out.println((char) i);
        }

        long[] intTaskTimes = new long[100];
        long[] longTaskTimes = new long[100];

        for(int i = 0; i < 100; i++){
            intTaskTimes[i] = intTask();
            longTaskTimes[i] = longTask();
        }

        System.out.println("int task in: " + middle(intTaskTimes));
        System.out.println("long task in: " + middle(longTaskTimes));
    }

    public static long intTask(){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++){
            //System.err.println(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long longTask(){
        long start = System.currentTimeMillis();
        for(long i = 0L; i < 100000000L; i++){
           // System.err.println(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long middle(long[] items){
        long sum = 0;
        for(long l : items){
            sum += l;
        }
        return sum / items.length;
    }
}