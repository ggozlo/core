package hello.core.singltone;

public class SingletonService {

    // 스태틱 영역에 자기자신 객체인스턴스 하나르를 생성
    private static final SingletonService instance = new SingletonService();

    // 객체 반환
    public static SingletonService getInstance() {
        return instance;
    }

    // 프라이빗 생성자로 외부 생성 차단
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
    

}
