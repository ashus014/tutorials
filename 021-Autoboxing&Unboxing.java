import java.util.ArrayList;

/**
 * Main
 */
public class Main {


    class IntClass{
        private int myValue;

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        
    }


    public static void main(String[] args) {
        String[] strArray = new String[5];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Ashu");

        //ArrayList<int> strArrayList = new ArrayList<int>();

        // ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        // intArrayList.add(new IntClass(54));

        //Integer integer = new Integer(54);

        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        //intArrayList.add(54);


        for(int i=0;i<5;i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0;i<5;i++){
            System.out.println(intArrayList.get(i).intValue());
        }

    }
}
