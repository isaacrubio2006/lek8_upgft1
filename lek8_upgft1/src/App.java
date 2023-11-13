import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
         // upgft b/a
     int varv=0; //<--ändra 0 till 2 för att få 2-5
        while (varv<=5 ) {
            System.out.println(varv++);
        }
        //upgft C
        for(int varv2=0; varv2<=6 ;varv2++)
        {
            System.out.println("tjena!, varv nummer"+varv2);
        }
        //upgft D

         int varv3=2;
         do{
            System.out.println("HEJ! varv nr:"+varv3);
            varv3++;            
        }
        while(varv3<=5);
        

        int tal=0;
        
            while(tal<5)
            {
                System.out.println(tal++);
            
            }
        
            for(int forloop=5; forloop>=0; forloop--)
               {
                   System.out.println(forloop);   
               }      
                int[] array = new int[5];
               for(int index=4; index<=array.length && index>=0 ;index--)
              
               {
                 System.out.println("skriv in element " + index);
                  array[index]=scan.nextInt();
               }
               
        


       
        }
    }
