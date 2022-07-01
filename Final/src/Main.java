// final class는 상속할 수 없음
public class Main extends Parent{

    // 부모 클래스에서 final을 붙이면 함수를 재정의할 수 없음
    public void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.show();
    }
}
