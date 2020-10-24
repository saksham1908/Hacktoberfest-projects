package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StocksSpanProblem{
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        // int[] price = {10, 4, 5, 90, 120, 80};
        int size = price.length;
        

        // creating object of the class stockscheck
        Stockscheck stk = new Stockscheck();
        int[] Sp = stk.checkFun(price, size);
        System.out.println(Arrays.toString(Sp));
    }
}
class Stockscheck{
    int[] checkFun(int[] price, int n){
        
        int[] Span = new int[n];
        // initiallising the first element in the array 
        Stack<Integer> stck = new Stack<>();

        // initiallising the first element in the stacks for index = 0;
        stck.push(0);
        // for first elelment the span is always 1
        Span[0] = 1;
        
        for (int i = 1; i < Span.length; i++) {
            while (stck.size()!=0 && price[stck.peek()] <= price[i]) {
                stck.pop();
            }

            Span[i] = (stck.empty()) ? i+1 : i - stck.peek() ;

            stck.push(i);
        }


        return Span;
    }
}