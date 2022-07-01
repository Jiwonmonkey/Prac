/*
    1. 상속
    - 모듈의 재사용과 코드의 간결성 제공
    - 상위 클래스의 모든 요소를 상속받고 추가적으로 더 가지는 확장의 개념
    - 상위 클래스를 지정하기 위해 extends 예약어 사용
    - 모든 자바 프로그램은 상위 클래스를 가짐(object 클래스가 묵시적인 최상위 클래스임)

    2. 형식
    - public/final/abstract class 클래스 이름 extends 상위 클래스 이름 {}
    public class Box extends SuperBox {...}

    3. 멤버 변수의 상속
    - 클래스가 상속되면 상위 클래스의 멤버 변수도 상속됨
    - 멤버 변수의 접근 한정자에 따라 상속이 결정
    - protected 접근 한정자 : 같은 패키지 내의 클래스와 같은 패키지는 아니지만 상속된
      클래스에서 사용 가능한 접근 한정자임

    4. 오버라이딩(overriding)
    - 상속관계에 있는 클래스들 간에 같은 이름의 메소드를 정의하는 행뒤
    - 상위 클래스의 메소드와 하위 클래스의 메소드가 메소드 이름은 물론 매개변수의 타입과
      개수까지도 같아야 함
    - 이름은 같지만 구현부분에서 변화가 필요할 때 재사용이 가능해 효율적인 장점을 갖음
    - 오버라이딩은 객체 지향의 다형성을 제공함

    5. 예약어 super
    - 하위 클래스에 의해 가려진 상위 클래스의 멤버 변수나 메소드에 접근할 떄 사용
    - 상위 클래스의 생성자를 호출할 때 사용

    6. 상속과 생성자
    - 묵시적(default) 생성자 : 매개변수가 없는 생성자
    - 클래스가 상속관계에 있을 때 각 클래스들이 묵시적 생성자를 모두 가지고 있다면,
      하위 클래스에서 객체가 생성될 때 상위 클래스의 묵시적 생성자가 하위 클래스의
      묵시적 생성자보다 먼저 수행됨
    - 묵시적 생성자는 객체를 생성할 때 자동으로 수행됨
    - 상위 클래스의 묵시적 생성자가 아닌 일반 생성자를 호출하기 위해서는 supe을 사용해야 함

    */
class Ea {
    void show() {
        System.out.println("상위 클래스의 메소드 show(String str) 수행");
    }
}
class Eb {
    void show() {
        System.out.println("하위클래스의 메소드 show() 수행");
    }
}
class D1 {
    int x = 1000;
    void display() {
        System.out.println("상위 클래스 D1의 display() 메소드 입니다.");
    }
}
class D2 extends D1 {
    int x = 2000;
    void display() {
        System.out.println("하위 클래스 D2의 display() 메소드 입니다.");
    }
    void write() {
        display();
        super.display();
        System.out.println("D2 클래스 객체의 x값은 : " + x);
        System.out.println("D1 클래스 객체의 x값은 : " + super.x);
    }
}
class A1 {
    double d1;
    A1() {
        System.out.println("클래스 A1의 생성자 수행");
        d1 = 10 * 10;
    }
}
class A2 extends A1 {
    double d2;
    A2() {
        System.out.println("클래스 A2의 생성자 수행");
        d2 = 10*10*10;
    }
}
class A3 extends A2 {
    double d3;
    A3() {
        System.out.println("클래스 A3의 생성자 수행");
        d3 = 10*10*10*10;
    }
}
class Ad1 {
    int d1;
    int s;
    Ad1(int s1) {
        System.out.println("클래스 Ad1의 생성자 수행");
        s = s1;
        d1 = s*s;
    }
}
class Ad2 extends Ad1 {
    int d2;
    int t;
    Ad2(int s1, int s2) {
        super(s1);
        System.out.println("클래스 Ad2의 생성자 수행");
        t = s2;
        d2 = t*t;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Eb over = new Eb();
        over.show(); // Ea에 show는 활용 안됨

        D2 d = new D2();
        d.write();

        A3 a = new A3();
        System.out.println("10의 제곱" + a.d1);
        System.out.println("10의 세제곱" + a.d2);
        System.out.println("10의 네제곱" + a.d3);

        Ad2 super2 = new Ad2(10, 20);
        System.out.println("10의 제곱은" + super2.d1);
        System.out.println("20의 제곱은" + super2.d2);
    }
}
