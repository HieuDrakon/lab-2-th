package lab2_b1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class account {
    Scanner sc = new Scanner(System.in);
    private long sotk;
    private String tentk;
    private double sotien,laisuat=0.035;
    String trangthai;
     public void account(long sotk,String tentk){
         sotien=50;
     }
    void account() {
        sotk=999999;
        tentk="chưa xác định";
        sotien=50;
}
    public void account(long sotk,String tentk,double sotien){
        this.sotien=sotien;
        this.sotk=sotk;
        this.tentk=tentk;       
    }
    long getSotk(){
        return sotk;
    }
    void setSotk(long sotk){
        if(sotk>0&&sotk!=999999){
            this.sotk=sotk;
        }
        else{
            this.sotk=999999;
        }
    }
    String getTentk(){
        return tentk;
    }
    void setTentk(String tentk){
        if(tentk!=null){
            this.tentk=tentk;
        }else{
            this.tentk="chưa xác định";
        }
    }
    double getSotien(){
        return sotien;
    }
    void setSotien(double sotien){
        if(sotien>=50){
        this.sotien=sotien;
    }else {
           this.sotien=50; 
        }
    }
    String getTrangthai(){
        return trangthai;
    }
    void setTrangthai(String trangthai){
        if(sotk>0&&sotk!=999999&&tentk!=null&&sotien>=50){
            this.trangthai="hợp lệ";
        }
        else{
            this.trangthai="không hợp lệ";
        }
    }
    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        //nếu số tiền nạp vào lớn hơn 0 thì hợp lệ
        if (nap >= 0) {
            sotien= nap + sotien;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {//ngược lại nếu số tiền nộp vào bé hơn 0 thì không hợp lệ
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
    public double rutTien() {
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        //nếu số tiền rút bé hơn hoặc bằng số tiền còn trong tài khoản + phí thì hợp lệ
        if (rut <= (sotien )) {
            sotien = sotien- (rut);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản.");
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }
    public double daoHan() {
        double laiSuat = 0.035;
        sotien= sotien+ sotien * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(sotien);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return sotien;
    }
 void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(sotien);
        System.out.printf("%-10d %-20s %-20s \n", sotk, tentk, str1);
 }
    @Override
   public String toString(){
        Locale local =new Locale("vi","vn");
        NumberFormat formater  = NumberFormat.getCurrencyInstance(local);
        formater.format(456953.12);
        return getSotk()+getTentk()+getSotien()+getTrangthai();
    }
   void nhap(){
       System.out.println("nhập số tk");
       sotk=sc.nextLong();
       System.out.println("nhập tên tk");
       tentk=sc.nextLine();
       System.out.println("nhập số tiền");
       sotien=sc.nextDouble();
   }
}
