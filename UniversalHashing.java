/**
PROBLEM STATEMENT:A universal hash function is to be designed for data set of 1000 unique numerical values.
                  The hash table is of size 20 and with each block memory of size 100 is attached.
                  Out of available locations ending with 1,3,4,5,9 can be used.
                  Illustrate the snapshot of the storage
*/
package ads_project;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gaurav
 */


public class UniversalHashing {
   
    int[] pos = {1,3,4,5,9};
    
        
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] hash = new int[20][100];
        int a =3,b=42,p=101,m=20;
        ArrayList<Integer> arr =new ArrayList<>();
        Random rand = new Random();
        
         for(int i = 0;i<20;i++){
              for(int j=0;j<100;j++){
                  hash[i][j]=0;
              }
        }
        
        
        while(arr.size()<1000){
            int random =rand.nextInt(10000);
            if(!arr.contains(random)) {
                arr.add(random);
            } 
        }
        int collision=0;
       
        
       
        for(int i = 0;i<arr.size();i++){
            //HASH FUNCTION
            int hashvalue=(((a*(arr.get(i))+b)%p)%m);
            for(int j=0;j<100;j++){
                if(j%10==1 || j%10==3 || j%10==4  || j%10==5 || j%10==9){
                    if(hash[hashvalue][j]!=0 && j%10==1){
                    }
                    if(hash[hashvalue][j]!=0 && j%10==3){
                    }
                    if(hash[hashvalue][j]!=0 && j%10==4){
                    }
                    if(hash[hashvalue][j]!=0 && j%10==5){
                        collision++;
                        
                    }
                    if(hash[hashvalue][j]!=0 && j%10==9){
                        collision++;
                    }
                    if(hash[hashvalue][j]==0){
                        hash[hashvalue][j]=arr.get(i);
                        break;
                   }
                }
            }
            
        }
        System.out.println("<<<<<<<<<<<<<<<<<< STORAGE SNAPSHOT >>>>>>>>>>>>>>>>>>>");
        System.out.println("");
        System.out.print("                               ");
        System.out.print("\t");
        for(int i=0;i<100;i++){
            System.out.print("\t"+i);
           
        }
        System.out.println("");
         for(int i = 0;i<20;i++){
             
             System.out.print("For Data Number: ------>>>>> "+i+"\t");
              for(int j=0;j<100;j++){
                  System.out.print("\t"+"|"+hash[i][j]+ "| ");
              }
              System.out.print("\n\n");
              
        }
        System.out.println("Collision   "+collision);
    }
    
}