public class Control6_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                continue; // 반복문의 맨 끝으로 이동
            System.out.println("i = " + i);
        }
    }
}
