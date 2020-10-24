package Stacks;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NearestGreaterToRight{
    public static void main(String[] args) {
        // defining the resultant vectors and the processing graph
        Vector<Integer> v = new Vector<>();
        Stack<Integer> s = new Stack<>();
        
        // defining the array to be computed
        int[] arr = {0,1,3,2,4,7,5,6};

        for(int i = arr.length-1; i >= 0; i--){
            if ( s.size() ==0) {
                v.add(-1);
                s.push(arr[i]);
            }
            else if ( s.size() > 0 && s.peek() > arr[i]) {
                v.add(s.peek());
                s.push(arr[i]);
            }
            else if ( s.size() > 0 && s.peek() <= arr[i] ){
                while(s.size() > 0 && s.peek() <= arr[i]){
                    s.pop();
                }
                if (s.size() == 0) {
                    v.add(-1);
                }
                else{
                    v.add(s.peek());
                }
                s.push(arr[i]);
            }
        }
        Collections.reverse(v);
        System.out.println(v);
    }
}