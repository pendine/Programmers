public class Max<N extends Number> {
//정수형과 실수형을 구분하지 않고 비교하여 큰 수를 반환함
//반환하는 형태는 반환되는 수의 형태에 맞춰 반환됨
//ex) int형이 double형으로 또는 그 반대로 반환되는 일이 없음.

//알게된것. N, E, T같은 대문자들을 사용해 클래스에서 사용할 인자들을
//개념적으로 다룰 수 있고,
//extends를 사용한 다른 상위 클래스들을 포괄해 좀 더 명확한 개념으로 다룰 수 있음.

    public N max(N a,N b) {
        return (a.doubleValue() >b.doubleValue())?   a:  b;
    }
}
