public class Problem3 {

    public int solve(int num1, int num2){

        int min = Math.min(num2, num1);
        int[]temp = new int[min];
        for(int i=0; i<=min; i++){
            if(num1%(i+1)==0 && num2%(i+1)==0){
                temp[i]=i+1;
            }
        }
        int GCD = 0;
        for(int j=0; j<temp.length; j++){
            if(temp[j]>GCD){
                GCD = temp[j];
            }

        }
        return GCD;
    }

}
