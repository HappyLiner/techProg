public class U0901WorkArray<T extends Number> {

    T[] numbers;

    U0901WorkArray(T[] array){
        numbers = array;
    }

    double sum(){
        double sum = 0;
        for(Number n : numbers){
            sum += n.doubleValue();
        }
        return sum;
    }
}
