package ac.weekly.js;

/**
 * @author Theo
 * @since 2024/01/01
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Member member1 = new Member(123456789);
        Member member2 = new Member(234567890);
        Member member3 = new Member(234567890);

        System.out.println(member1.getMemberId());
        System.out.println(member1.getBarcode());
        System.out.println(member2.getMemberId());
        System.out.println(member2.getBarcode());
        System.out.println(member3.getMemberId());
        System.out.println(member3.getBarcode());
    }
}



