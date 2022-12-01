import java.util.*;
public class OopsLineComparision {
    int x1;
    int y1;
    int x2;
    int y2;
    public  OopsLineComparision(int x1,int y1,int x2,int y2)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public  double length_of_line1(int x1,int y1,int x2, int y2)
    {
        double l1 = Math.pow((x2 - x1), 2);
        double l2 = Math.pow((y2 - y1), 2);
        double line1_length = Math.sqrt(l1 + l2);
        System.out.println("length of line one is:"+line1_length);
        return  line1_length;
    }
    public  void comparision_of_lines(double line1_length,double line2_length) {
        int compare=String.valueOf(line1_length).compareTo(String.valueOf(line2_length));
        if(compare==0){
            System.out.println("Lines are equal");
        } else if (compare>0) {
            System.out.println("Line1 is greater than are Line2");
        }else{
            System.out.println("Line1 is lessar than are Line2");
        }
    }
    public static void main(String[] args) {
        OopsLineComparision obj=new OopsLineComparision(4, 6, 6, 8);
        double line1_len=obj.length_of_line1(obj.x1,obj.y1,obj.x2,obj.y2);

        OopsLineComparision obj2=new OopsLineComparision(4, 2, 6, 8);
        double line2_len=obj2.length_of_line1(obj2.x1,obj2.y1,obj2.x2,obj2.y2);

        obj.comparision_of_lines(line1_len,line2_len);
    }
}
