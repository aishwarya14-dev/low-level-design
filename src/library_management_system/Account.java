package library_management_system;

public abstract class Account {
  private String id;
  private String password;
  private AccountStatus status;
  private Person person;
  
  public void resetPassword() {}
}
