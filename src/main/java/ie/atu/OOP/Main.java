package ie.atu.OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList< Member> members = new ArrayList<>();

        int choice = 0;

        while (choice!=0)
        {
            System.out.print("GYM MEMBERSHIP MANAGER: ");
            System.out.print("1 Add Member ");
            System.out.print("2 Display All Members ");
            System.out.print("3 Search by ID ");
            System.out.print("4 Remove Member ");
            System.out.print("5 Exit ");

            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(input.nextLine());

            if(choice==1){
                System.out.print("Enter Member ID: ");
                String memberId = input.nextLine();
                System.out.print("Enter Member Name: ");
                String memberName = input.nextLine();
                System.out.print("Enter Member Age: ");
                int memberAge = Integer.parseInt(input.nextLine());

                Member member = new Member(memberId, memberName, memberAge);
                members.add(member);
                System.out.print("Member Added Successfully!\n ");

            }
            else if(choice==2){
                if(members.isEmpty()){
                    System.out.println("No member found");
                }
                else{
                    for(Member member : members){
                        member.displayDetails();
                    }
                }
            }
            else if(choice==3){
                System.out.print("Enter Member ID: ");
                String searchID = input.nextLine();
                boolean found = false;
                for(Member member : members){
                    if(member.getMemberId().equals(searchID)){
                        member.displayDetails();
                        found=true;
                    }
                }
                if(found == true){
                    System.out.println("Member was not found");
                }
            }
            else if(choice==4){
                System.out.print("Member removed");
            }
            else if(choice==5){
                System.out.print("Exit");

            }

        }

    }
}