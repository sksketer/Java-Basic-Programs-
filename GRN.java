import java.util.*; 

class GenerateRandomNumber
 {
           public static void main(String[] args)
           { 
                     Scanner sc = new Scanner(System.in);
                     int n=sc.nextInt();
                      Random rnum = new Random(); 
                      System.out.println("Random Numbers:");          
                      for (int sketer = 0; sketer<n; sketer++) 
                      {
                       System.out.println(rnum.nextInt(200)); 
                       } 
           } 
}