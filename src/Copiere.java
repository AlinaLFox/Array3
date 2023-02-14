public class Copiere {
    public static void main(String[] args) {

        String initialArray[] = new String[] {"Ben", "John", "Lucy", "Ariel"};
        for (int i = 0; i < initialArray.length; i++){
        }

        String copyArray[] = new String[4];
        for (int i = 0; i < copyArray.length; i++){
            copyArray[i] = initialArray[i];

            System.out.println(copyArray[i]);
        }
    }
}