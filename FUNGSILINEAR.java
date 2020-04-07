/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi.linear;

/**
 *
 * @author Windows 10
 */
public class FUNGSILINEAR {
    private static int a;
    

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
    // deklarasi variabel
      double [] angka  = new double [100];
    // untuk memberi nilai pada tiap index
      for (int i=0; i<= 10; i++){
          System.out.print(angka);
      }
      double b = 2;
      double x = 0;
      
    //proses
     
    System.out.println("Jika x = 6*a/b, nilai x adalah...");
    for (double i=0; i<= 10 ; i++){
       x = 6*a/b;
    }        
    
    
    //OUTPUT 
    System.out.println("x = "+x);
    }
    
}
