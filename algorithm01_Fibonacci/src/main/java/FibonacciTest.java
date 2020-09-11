public class FibonacciTest {
    public static void main(String[] args) {
        //求第N个斐波那契数的数值 0 1 1 2 3 5 8 13 21 34 55
        //计算执行fib1(40)算法耗费的时间
        long begin = System.currentTimeMillis();
        System.out.println(fib1(40));//耗时：0.554
        long end = System.currentTimeMillis();
        double delta = (end - begin) / 1000.0;
        System.out.println(delta);
        //计算执行fib2(40)算法耗费的时间
        long begin1 = System.currentTimeMillis();
        System.out.println(fib2(40));//耗时：0.0
        long end1 = System.currentTimeMillis();
        double delta1 = (end1 - begin1) / 1000.0;
        System.out.println(delta1);
    }

    private static int fib1(int n) {
        if (n <= 1) return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    private static int fib2(int n) {
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}
