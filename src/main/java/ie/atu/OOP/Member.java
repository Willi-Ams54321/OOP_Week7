package ie.atu.OOP;

public class Member
{
    private final String memberId;
    private final String membername;
    private final int memberage;

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
