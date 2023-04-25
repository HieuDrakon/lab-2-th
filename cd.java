package lab2_b2;

import java.util.Scanner;

public class cd {
    private int macd,sobaihat;
    private String tuacd;
    private float giathanh;
    void cd(){
        macd=999999;
        tuacd="chưa xđ";
    }
    void cd(int macd,int sobaihat,String tuacd,float giathanh ){
        this.macd=macd;
        this.tuacd=tuacd;
        this.giathanh=giathanh;
        this.sobaihat=sobaihat;
    }
    int getMacd(){
        return macd;
    }
    void setMacd(int macd){
        if(macd >0){
        this.macd=macd;
    }else{
            this.macd=999999;
        }
    }
    String getTuacd(){
        return tuacd;
    }
    void setTuacd(String tuacd){
        if(tuacd==null){
        this.tuacd=tuacd;
    }else{
            this.tuacd="chưa xđ";
        }
    }
    int getSobaihat(){
        return sobaihat;
    }
    void setSobaihat(int sobaihat){
        if(sobaihat >0){
       this.sobaihat=sobaihat;
    }else{
        }
    }
    float getGiathanh(){
        return giathanh;
    }
    void setGiathanh(float giathanh){
        if(giathanh >0){
       this.giathanh=giathanh;
    }else{
        }
    }
    @Override
    public String toString(){
        return getMacd()+getTuacd()+getSobaihat()+getGiathanh();
    }
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",macd,tuacd,sobaihat,giathanh);
    }
}
