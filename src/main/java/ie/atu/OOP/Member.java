package ie.atu.OOP;

public class Member
{
    //Task 1
    private String memberId;
    private String membername;
    private int memberage;

    public Member(String memberId, String membername, int memberage)
    {
        this.memberId=memberId;
        this.membername=membername;
        this.memberage=memberage;
    }

    public String getMemberId()
    {
        return memberId;
    }
    public String getMembername()
    {
        return membername;
    }
    public int getMemberage()
    {
        return memberage;
    }

}
