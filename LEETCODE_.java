class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int sum =0 ;
        int max_val = Integer.MIN_VALUE ;

        for(int i=0 ; i<piles.length ; i++){

            if(piles[i]>max_val){
                max_val = piles[i] ;
            }
        }

        int min_val = 1 ;

        int ans = max_val ;

        while (min_val<max_val){
            int mid =min_val+(max_val-min_val)/2 ;

            int hours = 0 ;

            for(int i=0 ; i<piles.length ; i++){
                hours = hours+(piles[i]+mid-1)/mid ;
            }

            if(hours>h) min_val = mid+1 ;

            else{
                ans = mid ;
                max_val = mid ;
            }
        }
        return  ans ;

    }
}