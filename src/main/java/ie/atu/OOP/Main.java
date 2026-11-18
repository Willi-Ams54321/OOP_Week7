package ie.atu.OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList< Member> members = new ArrayList<>();
        members.add(new Member("GYM54321","Albert Chimes",24));
        members.add(new Member("GYM98765","Frank Miles",72));

        for(Member member: members){
            System.out.println(member);
        }
    }
}