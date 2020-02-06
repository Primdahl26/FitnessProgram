public class Member extends Person {

    private Boolean isBasic;

    public Member(Boolean isBasic, String name, String cpr) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType(){
        String MembershipType;

        if(isBasic){
            MembershipType="Basic";
        }else{
            MembershipType="Full";
        }
        return MembershipType;
    }

    public int monthlyFee(){
        int Fee;

        if(isBasic){
            Fee=199;
        }else{
            Fee=299;
        }
        return Fee;
    }
}