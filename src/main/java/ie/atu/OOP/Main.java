package ie.atu.OOP;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List< Member> members = new ArrayList<Member>();

        Member member = new Member("GYM54321","Albert Chimes",24);
        Member member2 = new Member("GYM98765","Frank Miles",72);

        System.out.println(member.getMemberId());
        System.out.println(member.getMembername());
        System.out.println(member.getMemberage());
    }
}