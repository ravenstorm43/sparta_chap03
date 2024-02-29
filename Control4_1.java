public class Control4_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            //1부터 10까지의 난수 만들기
            //System.out.println(Math.random() * 10); // 0.0*10 <= x*10 < 1.0*10
            //System.out.println((int)(Math.random() * 10)); // 0*10 <= (int)x*10 < 1*10
            //System.out.println((int)(Math.random() * 10) + 1); // 1 <= (int)x*10+1 < 11

            //System.out.println((int)(Math.random() * 11)); // 0 <= (int)x*11 < 11
            System.out.println((int)(Math.random() * 11) - 5); // -5 <= (int)x*11-5 < 6
        }
    }
}
