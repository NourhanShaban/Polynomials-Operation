
package polynomialsoperation;

import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author NORHAN
 */
public class PolynomialsOperation {

         public static double gcd(double key1,double key2)
       {
      
       
       double max=0;
        
        if(key2>key1)
        {
            while(key1!=0)
            {max=key2%key1;
            key2=key1;
            key1=max;
            
            }
           return key2; 
        }
        else{
             while(key2!=0)
            {max=key1%key2;
            key1=key2;
            key2=max;
            
            }
            return key1; 
            
        }
       }
         public static long modulus(long f)
         {
             if(f<256)
			return f;

		f=f^283;
		return f;
         }
    public static void main(String[] args) {
        
        
        Scanner s1=new Scanner (System.in);
        String num1=s1.next();
        String num2=s1.next();
       long d= Long.parseLong(num1, 16);
        long f=Long.parseLong(num2, 16);
        long res=d^f;
         String t= String.format("%02X",res );
         long product=0;
         String product1;
         while(f>0){
			if((f%2)==1){
				product=modulus(product^d);
			}

			f=f>>1;
			d=d<<1;
			d=modulus(d);
        
        

        
 
    }
        product1= String.format("%02X",product);
         
         System.out.println(t+" "+product1);
         
    }


}
