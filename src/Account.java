public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public String getId() {
        return id;
    }

    public  void setStatus(AccountStatus s){
        this.status = s;
    }

}
