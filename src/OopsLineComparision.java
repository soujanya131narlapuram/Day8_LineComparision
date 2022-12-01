
public class OopsLineComparision {
    int x1;
    int y1;
    int x2;
    int y2;
    double line1_length;
    public  OopsLineComparision(int x1,int y1,int x2,int y2)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public  void length_of_line1()
    {
        double l1 = Math.pow((x2 - x1), 2);
        double l2 = Math.pow((y2 - y1), 2);
        double line1_length = Math.sqrt(l1 + l2);
        System.out.println("length of line one is:"+line1_length);
    }
    public static void main(String[] args) {
        OopsLineComparision obj=new OopsLineComparision(4, 6, 6, 8);
        obj.length_of_line1();
    }
}
