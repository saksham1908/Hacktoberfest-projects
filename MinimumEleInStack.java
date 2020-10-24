package Stacks;

import java.util.Stack;

class stacks{
    Stack<Integer> stk = new Stack();
    private int minEle, maxEle;
    
    stacks(){
        this.minEle = Integer.MAX_VALUE;
        this.maxEle = Integer.MIN_VALUE;
    }
    int calcmin(int data){
        return (data>minEle)? data : (2*data-minEle) ;
    }
    int calcMax(int data){
        return (data> maxEle)? (2*data+maxEle) : data;
    }
    void push(int data){
        if(stk.isEmpty()){
            stk.push(data);
            minEle = data;
            maxEle = data;
        }
        else{
            if (calcmin(data) == 2*data-minEle) {
                stk.push(calcmin(data));
                minEle = data;
            }
            else if (calcMax(data) == 2*data+maxEle){
                stk.push(calcMax(data));
                maxEle = data;
            }
            else{
                stk.push(data);
            }
        }
    }
    int pop(){
        int tempPop;
        if (stk.isEmpty()) {
            System.out.println("Empty Stack");
            tempPop = -1;
        }
        else{
            if (stk.peek() > maxEle) {
                // condition for checking out the flag of the max element
                tempPop = maxEle;
                maxEle = stk.peek()-2*maxEle;
                stk.pop();
            }
            else if(stk.peek() < minEle) {
                tempPop = minEle;
                minEle = 2*minEle-stk.peek();
                stk.pop();
            }
            else{
                tempPop = stk.peek();
            }
        }
        return tempPop;
    }
    int getmin(){
        if (stk.isEmpty()) {
            return -1;
        }
        return minEle;
    }
    int getmax(){
        if (stk.empty()) {
            return -1;
        }
        return maxEle;
    }
    void show(){
        String print = stk.toString();
        System.out.println(print);
    }
}

public class MinimumEleInStack {
    // this question will be done by using extra space of O(n) and also in O(1)
    // while doing this example in On we use two stacks the second stack is used as a counter and the minimum element will be the element at the top of counter stack
    // in this question we will be doingthis in O1 space
    public static void main(String[] args) {
        stacks stk = new stacks();
        stk.push(10);
        stk.push(3);
        stk.push(5);
        stk.push(6);
        stk.push(12);
        stk.push(2);
        stk.show();
        // popEle = stk.pop();
        // System.out.println(popEle);
        System.out.println(stk.getmin());
        System.out.println(stk.getmax());
        int popEle = stk.pop();
        System.out.println(popEle);
        popEle = stk.pop();
        System.out.println(popEle);
        stk.show();
        System.out.println(stk.getmax());
        System.out.println(stk.getmin());
    }    
}
