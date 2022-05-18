import java.util.*;


class Count {
    
    public static int CountDistinct(int a[]){
        HashSet<Integer>set=new HashSet<>();
         for(int Element:a){
         set.add(Element);
         }
         return set.size();
 
     }
 
     public static void main(String[] args){
         Scanner b = new Scanner(System.in);
         int n=b.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++){
             a[i]=b.nextInt();
           
             
         }
        
 
         System.out.println(CountDistinct(a));
 
         b.close();
     }
     
     
    
     
    
}
