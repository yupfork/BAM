import com.bean.User;
import org.junit.Test;

public class test {

    @Test
    public static void main(String[] args) {
        String s1 = "123";

        String s3 = "1";
        String s2 = "123";
        String s4 = s3+"23";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("----------");
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));


        User user = new User();
        User u1 = new User();
        u1.setDepartmentNo("123");
        user.setDepartmentNo("123");
        System.out.println(u1.getDepartmentNo() == s1); //true
        System.out.println(u1.getDepartmentNo() == s2); //false 由此得出 set方法所赋予的String存放在数据常量池中
        System.out.println(u1.getDepartmentNo().equals(s1)); //true
        System.out.println(u1.getDepartmentNo().equals(s2)); //true
    }
}
