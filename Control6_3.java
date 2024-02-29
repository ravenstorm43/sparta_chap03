public class Control6_3 {
    public static void main(String[] args) {
        allLoop : // 반복문에 이름 부여 이중, 삼중이상의 반복문의 조건을 한번에 건너뛰는 용도로도 사용할 수 있음
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
