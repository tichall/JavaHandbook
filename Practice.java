class Data {
    int x;
    int y;
}

public class Practice {
    public static void main(String[] args) {
        Data data = new Data();

        data.x = 20;
        data.y = 30;

        System.out.println("data 인스턴스 변수 x : " + data.x);
        System.out.println("data 인스턴스 변수 y : " + data.y);

        changeParameter(data.x, data.y);
        System.out.println("변경 후 data 인스턴스 변수 x : " + data.x);  // 20
        System.out.println("변경 후 data 인스턴스 변수 y : " + data.y);  // 30
    }
    static void changeParameter(int x, int y) {
        System.out.println("변경 전 x 값 : " + x);  // 20
        System.out.println("변경 전 y 값 : " + y);  // 30

        x = 100;
        y = 200;

        System.out.println("x 값 : " + x);   // 100
        System.out.println("y 값 : " + y);   // 200
    }
}
