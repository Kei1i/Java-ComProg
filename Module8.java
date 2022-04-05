public class Module8 {
    public static void main(String[] args){

        //For Loop
        for(int i=1;i<=10;i++) {
            System.out.println("Number "+i);
        }


        //While Loop
        int x=0;
        System.out.println("Let's count to 10!");
        while(x<10){
            x=x+1;
            System.out.println("Number: "+x);
        }
        System.out.println("We have counted to 10!");


        //System.out.printf(Format String, ArgList);
        /**
         * Format String:
         * (%d) integers(integer decimals)
         * (%f) floating-point numbers
         * (%s) strings
         * (%S) upper case string
         * (%c) character
         * (%C) upper case character
         * (%b) boolean
         * (%B) upper case boolean
         * ...etc.
         * 
         * ArgList:
         * optional
         * 
         * Example Below
         */
        
    
         String a="Keisha";
         int b=1;
         double c=0.1;
         System.out.printf("Hello %s!\n",a);
         System.out.printf("%d\n",b);
         System.out.printf("%f\n",c);
        //or
         System.out.printf("Hello %s!\n","Keisha");
         System.out.printf("%d\n",1);
         System.out.printf("%f\n",0.1);


        //Reverse A Number
        int num=12345;
        int revers=0;

        for(;num!=0;num/=10) {
            int digit=num%10;
            revers=revers*10+digit;
        }
        System.out.println("Reverse Number: "+revers);

    }
    
}
