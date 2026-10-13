package gestion;

public class Main {
    public static void main(String[] args) {
        EmployePermanent e1 = new EmployePermanent("Ali", 2500);
        EmployePermanent e = new EmployePermanent("Ali", 2500);

        e1.appliquerPrime(200);
        e.appliquerPrime(300);
        e.calculerSalaire();
        System.out.println(e);
    }
}