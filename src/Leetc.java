import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Leetc{
    public static void rotatebyK(int[] arr,int k){
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
    }
    public static void main(String[] args) {
        //String

        String name = "hrihtk'";
        String reversal = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            System.out.println(name.charAt(i));
            reversal = reversal + name.charAt(i);
        }
        System.out.println(reversal);
        System.out.println(reversal.equals(name)?"Palindrome" :"NON palindrome");

        //array
        int[] arr={66,9,8,5,3,64,2,1,3,2,1,5,1,4,2,5,3,6,7};
        rotatebyK(arr,10);
        System.out.println(Arrays.toString(arr));  //it is working

        name = "Hrithik";

//        int[] min_maxString = new int[256];
//        for (int i = 0; i < name.length(); i++) {
//            min_maxString [name.charAt(i)]    +=1;
//        }
////        System.out.println(Arrays.toString(min_maxString));

        HashMap<Character,Integer> hashmap =new HashMap<>(26);
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (hashmap.containsKey( ch )){
                int oldfrequency = hashmap.get(ch);
                int newf = oldfrequency+1;
                hashmap.put(ch,newf);
            }else {
                hashmap.put(ch,1);
            }
        }
        System.out.println(hashmap.toString());

        char mfc = name.charAt(0);
        for (Character key : hashmap.keySet()){
            if (hashmap.get(key) >hashmap.get(mfc)){
                mfc=key;
            }
        }
        System.out.println(mfc);

        int array[]= {10,30,0,1,2,5,4,6,3,6,5,5,5,5,5,54,7,8,9,6,5,4,4,4,4,6,6,6,63,2,3,2,52};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
        System.out.println(set);
        }
    }

