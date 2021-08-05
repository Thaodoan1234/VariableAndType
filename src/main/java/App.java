public class App {
   //khai báo biễn toàn cục
    static String global = "global variable";

    public static void main(String[] args) {
       // khai  báo biến cục bộ
 //       String str;
 //       str = "Data Type";

        String str = "Data Type";
        System.out.println(str);

        //khai báo hằng, hằng là giá trị mặc định
        final double PI = 3.14;
        System.out.println(PI);

        //ký tự đặc biệt dấu cách \t
        System.out.println("Name\tDOB");

        //kiểu dữ liệu nguyên thủy
        short a = 10;   //-32768 -> 32767
        int i= 100;     //-2^31 -> 2^31-1
        //kiểu long có giá trị nhỏ hơn 100 thì thêm L sau giá trị
        long l = 100L;
        long l2 = 1000000000;  //-2^63 ->2^63-1
        float f = 3.1f;   //thêm f ở value
        double d = 5.7;   //mặc định biến d
        char c = 'a';     //ký tự
        char c2 = 65;     //ký tự ở vị trí thứ 65 trong bảng mã ASCII ->"A"
        boolean b = true;  //kiểu logic
        boolean b2 = false;

        System.out.println(i);
        System.out.println(a);
        System.out.println(l);
        System.out.println(l2);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c2);

 //kiểu dữ liệu tham chiếu
        //biến ref_i là biến tham chiếu
        Integer ref_i = 100;

        Integer a1 = 100;
        Integer b1 = 200;
        System.out.println("a1 = " + a1 + ", b1 = " + b1);
        swap(a1, b1);
        System.out.println("a1 = " + a1 + ", b1 = " + b1);

        //tạo kiểu dữ liệu mới
        SimpleSeason sse = SimpleSeason.SPRING;
        System.out.println(sse);


        }
        static void swap(Integer a2, Integer b2) {
            a2 = 99;
            Integer tmp = a2;
            a2 = b2;
            b2 = tmp;
            System.out.println("Swap: a2 = " + a2 + ", b2 = " + b2);
            //swap(a2, b2);
            System.out.println("a2 = " + a2 + ", b2 = " + b2);
        }

    public static void sum() {
        System.out.println(global);
    }
}
