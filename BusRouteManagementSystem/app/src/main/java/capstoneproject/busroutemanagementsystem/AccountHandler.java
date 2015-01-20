package capstoneproject.busroutemanagementsystem;

/**
 * Created by CaliphCole on 01/20/2015.
 */
public class AccountHandler {


    /*
    Variables for signing up
     */
    private String id;
    private String password;
    private String email;

    /*
    varaibles to modify account
     */
    private String status;
    private int authenticationAttempt;

    private static String BLOCKED = "Account as been suspended";
    private static String UNBLOCKED = "Account is active";


    /*
    Constructor for new account
     */
    public AccountHandler(String id,String password, String email){

        this.id = id;
        this.password = password;
        this.email = email;
        this.status = UNBLOCKED;
    }

    /*
    Constructor for existing account
     */

    public AccountHandler(){

    }


    /*
    Create user account
     */

    public void createAccount(String id,String password,String email){

    }

    /*
    Suspend account
     */
    public void suspendAccount(String id){


    }

    /*
    Handles bus ticket for each account
     */
    public void ticketsIssue(){


    }


}
