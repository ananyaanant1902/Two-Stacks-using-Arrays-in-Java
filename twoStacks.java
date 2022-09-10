class TwoStacks{
    int size;
    int[] arr;
    int top1,top2;
    TwoStacks(int size){
        this.size=size;
        this.arr=new int[size];
        this.top1=-1;
        this.top2=size;
    }

    void push1(int val){
        if(top1<top2-1){
            top1++;
            arr[top1]=val;
        }
        else{
            System.out.println("Stack overflow");
        }
    }

    void push2(int val){
        if(top1<top2-1){
            top2--;
            arr[top2]=val;
        }
        else{
            System.out.println("Stack overflow");
        }
    }

    int pop1(){
        if(top1<0){
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        else{
            int x=arr[top1];
            top1--;
            System.out.println("POPPED");
            return x;
        }
    }

    int pop2(){
        if(top2>=size){
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        else{
            int x=arr[top2];
            top2++;
            System.out.println("POPPED");
            return x;
        }
    }
  
  public static void main(String[] args){
        TwoStacks twoStacks=new TwoStacks(14);
        twoStacks.push1(12);
        twoStacks.push1(13);
        twoStacks.push1(14);
        //
        twoStacks.push2(15);
        twoStacks.push2(16);
        twoStacks.push2(17);
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());
        System.out.println(twoStacks.pop2());
}
