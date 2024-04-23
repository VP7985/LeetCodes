class Solution {
    public int reverse(int x) {
        
        
        //All Test Case Passed O(N) Time Complexity
        long revNum = 0;
		
		//loop for +ve numbers
        while(x>0){
            int last = x % 10;
            revNum = revNum * 10 + last;
            x/=10;
        }
		
		//loops for -ve numbers
        while(x<0){
            int last = x % 10;
            revNum = revNum * 10 + last;
            x/=10;
        }
        
        if(revNum >= -( Math.pow(2,31) )  &&  revNum< Math.pow(2,31) ){
            return (int)revNum;
        }else{
            return 0;
        }
    }
}