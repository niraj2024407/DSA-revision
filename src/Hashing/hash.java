package Hashing;

//public class hash {
//    public static void main(String[] args) {
//        int[] arr = {5, 6, 5, 6, 9, 6};
//        int cnt = 0;
//        for(int num : arr){
//            if(num == 6){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
//}

public class hash {
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 6, 9, 6};
        int[] hashTable = new int[10];

        for (int num : arr) {
            hashTable[num]++;
        }
        System.out.println(hashTable[6]);
    }
}

