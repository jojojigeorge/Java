public class amstrong {
    public static void main(String[] args) {
        int input=153 ,n=0,d,x=input;
        while (x!=0) {//calculate no of elements
            x/=10;
            ++n;
        }
        int sum_power=0;
        x=input;
        while (x!=0) {
            d=x%10;
            sum_power+=Math.pow(d, n);
            x=x/10;

        }
        if(sum_power==input){
            System.out.println(input + " is an amstrong number");
        }else{
            System.out.println(input +" is not a amstrong number");
        }
    }
}
