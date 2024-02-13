import java.util.concurrent.ThreadLocalRandom;
public class otp{
    public static void main(String[] args) {
        
        System.out.println("Your OTP: "+ThreadLocalRandom.current().nextInt(0, 999999));
    }
}