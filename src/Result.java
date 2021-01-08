import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        EmValidation ob=new EmValidation();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter email id..");
        ob.setEmial_Id(sc.nextLine());
       System.out.println(ob.getEmial_Id());
       int val=ob.getEmial_Id().indexOf("@");
       if(val!=0)
       {
           System.out.println("position:"+val);
           int len=ob.getEmial_Id().length();
           System.out.println(len);
           System.out.println(ob.getEmial_Id().substring(0,val));
           String sub=ob.getEmial_Id().substring(val-1,len);
           System.out.println(sub);
           int val1=sub.indexOf(".");
           if(val1!=0)
           {

           }else
           {
           }






       }else
           {
               System.out.println("not valid");
           }


    }
}
