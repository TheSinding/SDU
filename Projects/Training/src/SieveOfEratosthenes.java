//import java.util.HashSet;
//import java.util.Set;
//
///**
// * Created by thesinding on 6/5/17.
// */
//public class SieveOfEratosthenes {
//    public int classicSieve(int n){
//        Set<Integer> returnSet = new HashSet<>();
//        Set<Integer> toRemoveSet = new HashSet<>();
//        for(int i = 1; i < n; i++){
//            returnSet.add(i);
//        }
//        for(int t : returnSet){
//            for(int i = 2; i < 9; i++){
//                if(t % i == 0 && t != i){
//                    System.out.println(t);
//                    toRemoveSet.add(t);
//                }
//            }
//        }
//        returnSet.removeAll(toRemoveSet);
//
//        return returnSet.size();
//    }
//    public int arraySieve(int n){
//        boolean[] A = new boolean[n+1];
//        A[0] = false;
//        A[1] = false;
//        for(int i = 2; i < A.length; i++){
//            A[i] = true;
//        }
//        for(int j = 2; j * j <= n; j++){
//            for(int )
//        }
//    }
//}
