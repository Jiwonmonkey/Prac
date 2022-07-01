class Acast {
    int a = 1;
}
class Bcast extends Acast {
    int b = 2;
}
class Ccast extends Bcast {
    int c = 3;
}
class Am {
    void callme() {
        System.out.println("클래스 Am의 callme() 메소드 실행");
    }
}
class Bm extends Am{
    void callme() {
        System.out.println("클래스 Bm의 callme() 메소드 실행");
    }
}
class Cm extends Bm{
    void callme() {
        System.out.println("클래스 Cm의 callme() 메소드 실행");
    }
}
class An {
    int i, j;
}
class Bn extends An {
    int n;
}
class Cn extends Bn {
    int m;
}
public class Cast {
    public static void main(String[] args) {
        Acast refA;
        refA = new Ccast(); // Acast 타입의 객체 변수 refA에 Ccast 클래스의 객체를 생성하여 할당
        System.out.println("ref의 값은 " + refA.a); // refA.c는 클래스 멤버에 접근 오류 발생
        // Ccast refC = new Acast(); 도 오류

        /*
        1. 하위 클래스에서 생성된 객체를 상위 클래스 형의 객체 변수에 배정하는 형변환은 허용
        2. 반대로 상위 클래스에서 생성된 객체를 하위 클래스 형의 객체 변수에 배정할 수 없음
        3. 상위 클래스 형의 객체 변수에 배정된 하위 클래스 객체의 경우,
        상위 클래스 형의 객체 변수를 통해서는 상위 클래스에 선언된 속성에만 접근이 가능
         */

        Am r = new Am();
        r.callme();
        r = new Bm();
        r.callme();
        r = new Cm();
        r.callme();

        /*
        * instanceof : 객체가 특정 클래스나 인터페이스로부터 생성된 객체인지를 판별하여
        * true혹은 false값을 반환하여 주는 이진 연산자
         */
        An a = new An();
        Bn b = new Bn();
        Cn c = new Cn();
        if(a instanceof An) {
            System.out.println("a는 A클래스의 객체");
        }
        if(b instanceof Bn) {
            System.out.println("b는 B클래스의 객체");
        }
        if(c instanceof Cn) {
            System.out.println("c는 C클래스의 객체");
        }
        if(c instanceof An) {
            System.out.println("c는 A클래스의 객체 : 형변환");
        }
        if(a instanceof  Cn) {
            System.out.println("a는 C클래스의 객체 : 형변환");
        }
        else System.out.println("a는 C클래스의 객체가 아님 : 형변환 불가");

        /*
         # 추상 클래스
         1. 하위 클래스에 구현되는 추상적인 기능만을 정의하는 클래스
         2. 추상 클래스는 기능이 무엇(what)인지만을 정의하고, 어떻게(how)구현되는지는 정의하지 않음음
        */
    }
}
