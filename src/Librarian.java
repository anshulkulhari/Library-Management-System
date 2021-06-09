

public class Librarian extends Account {

    public void blockMember(Member member){
        member.setStatus(AccountStatus.BLACKLISTED);
    }
    public void unblockMember(Member member){
        member.setStatus(AccountStatus.ACTIVE);
    }
}
