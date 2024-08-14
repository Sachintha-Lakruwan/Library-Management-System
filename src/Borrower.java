public class Borrower {
    private final String Name;
    private final String ContactInformation;
    private final String MembershipID;

    public Borrower(String name, String contactInformation, String membershipID) {
        Name = name;
        ContactInformation = contactInformation;
        MembershipID = membershipID;
    }

    public String getName() {
        return Name;
    }

    public String getContactInformation() {
        return ContactInformation;
    }

    public String getMembershipID() {
        return MembershipID;
    }
}
