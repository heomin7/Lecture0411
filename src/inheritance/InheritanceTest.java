package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class InheritanceTest {
    public static void main(String[] args){
        Child c = new Child();
        c.smoke();

        Parent p = new Child(); // 성립됨, is a 관계라서 적용이 됨. is a 는 '=' 의미로 할당이 됨...

        List<String> a = new ArrayList<>();

        p.smoke();      //생성자가 아들이므로 컨텐츠는 아들이고, 타입은 아버지임(polymolphism = 다형성)
        //함수를 어떤 타입을 사용할 지 미리 호출 세팅을 전기 바인딩, 컴파일 타임 시 함수 타입을 판단하는 것을 후기 바인딩, 자바는 후기 바인딩
        //런타임 바인딩(late binding)
        //late binding 이 더 진화적임. go언어는 전기 바인딩을 씀

        //자바는 오버라이딩을 못하는것이 없음. C, C++, C#은 아무 함수나 오버라이딩 못함
        //final 키워드 붙이면 자바에서 오버라이딩 할 수 없음.

    }
}
