import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        System.out.println("Enter two Numbers: ");
        Scanner r= new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        System.out.println("-----------");
        System.out.println("1. [+]");
        System.out.println("2. [-]");
        System.out.println("3. [*]");
        System.out.println("4. [/]");
        System.out.println("5. [%]");
        System.out.println("Select Operation: ");
        ch=r.nextInt();

        if(ch==1){
            cal=n1+n2;
            System.out.println(cal);
        }
        else if(ch==2){
            cal=n1-n2;
            System.out.println(cal);
        }
        else if(ch==3){
            cal=n1*n2;
            System.out.println(cal);
        }
        else if(ch==4){
            cal=n1/n2;
            System.out.println(cal);
        }
        else{
            cal=n1%n2;
            System.out.println(cal);
        }
    }
}