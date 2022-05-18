import java.util.HashMap;
import java.util.Scanner;
import java.util.zip.CRC32C;

import javax.swing.InputMap;

public class hasmap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> CountFec=new HashMap<>();
        for (i=0;i<arr.length;i++){
            int num=input[i];
            if(CountFec.containsKey(num)){
                int count=CountFec.get(num);
                count++;
                CountFec.put(num, count);
            }
            else{
                CountFec.put(num, 1);
            }

            
        }
        for(Entry<Integer,Integer> val:CountFec.entrySet()){
            System.out.println(val.getKey()+" "+val.getValue());
        }

        sc.close();
    }
  
}
