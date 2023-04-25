package lab2_b1;

import java.util.ArrayList;
import java.util.Scanner;

public class accountlist {
    ArrayList[] acclist ;
    int count;
    public void accountlist(){
        count =0;
        ArrayList account = acclist[10];
    } 
    public void accountlist(int n){
       if(n>0){
           ArrayList account = acclist[n];
       }else{
           ArrayList account = acclist[10];
       }
       count =0;
    }
    void them(int n){
       
        if( n  > acclist.length){
          ArrayList<account> a = new ArrayList();
          for(account acc:a){
          acc.nhap();
          a.add(acc);
        }
    }
        else{
            System.out.print("ko còn chổ trống");
        }
    }
}


