package havasıcaklığınagöreonerme;
import java.util.Scanner;
import java.math.*;

public class HavaSıcaklığınaGöreOnerme {
    public static void main(String[] args) {
        int sıcaklık;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Hava sıcaklığını giriniz");
        sıcaklık=input.nextInt();
        
        if(sıcaklık<5){
            System.out.println("Kayak");
            
        }
        else if(sıcaklık>=5 && sıcaklık<=15){
             System.out.println("Sinema");
            
        }
        else if(sıcaklık>15 && sıcaklık<=25){
             System.out.println("Piknik");
            
        }
        else if(sıcaklık>25){
             System.out.println("Yüzme");
        }
        
    }
    
}
