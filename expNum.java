import java.util.Scanner;
public class expNum{

    public static void main(String[] args) {

        Scanner imp=new Scanner(System.in);
     
        double limit , i , j  ;

        limit=imp.nextDouble();

            if (limit >= 1){

                for( i = 1 ; i <= limit ; i *= 4){

                    System.out.println("4'ün kuvvetleri :"+i);
                }
                      
                    for( j = 1 ; j <= limit ; j *= 5){

                        System.out.println("5'in kuvvetleri :"+j);
                     
                    }
                    
            }
            
        }
}
    

