public class CompoundIntrest {
    public static void main(String[] args) {
        double principal = 1000.0, rate = 0.05, n = 12, t = 5;
        double finalAmount = principal * Math.pow(1 + rate / n, n * t) - principal;
        
        System.out.println("Final Amount (including interest): $" + finalAmount);
    }
}
