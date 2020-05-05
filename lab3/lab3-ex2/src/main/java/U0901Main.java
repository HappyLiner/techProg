public class U0901Main {

    public static void main(String[] args) {
        Integer[] ints = {10, 20, 15};
        Float[] floats = new Float[3];
        for(int i = 0; i < 3; i++){
            floats[i] = (float) Math.random();
        }

        U0901WorkArray<Integer> intArray = new U0901WorkArray<Integer>(ints);
        U0901WorkArray<Float> floatArray = new U0901WorkArray<Float>(floats);

        System.out.println(intArray.sum());
        System.out.println(floatArray.sum());

        String[] strings = {"", "", ""};
//        U0901WorkArray<String> stringsArray = new U0901WorkArray<String>(strings);
    }
}
