package JP2.registration;

public class Registration {
    /***
     * Create Registration Class in which you would have variables such as email, userName
     * and password that have an access scope only within its own class. After creating an
     * object of the class, the user should be able to call methods and in each method
     * separately pass values to set users email, username and password.
     * Requirements:
     * ● Valid email consider to be only yahoo
     * ● Valid userName and password cannot be empty and should be of length larger
     * than 6 characters. Also, valid passwords cannot contain userName.
     */
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email != null && email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Please check the email requirements");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isBlank() && userName.length() > 6) {
            this.userName = userName;
        } else {
            throw new IllegalArgumentException("Please check the username requirements");
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isBlank() && password.length() > 6 && userName != null && !password.contains(userName)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Please check the password requirements");

        }
    }

    public static void main(String[] args) {

        Registration user = new Registration();

        try {
            user.setEmail("user@yahoo.com");
            user.setUserName("User12345");
            user.setPassword("54321User");
            System.out.println("Registration completed");
        } catch (IllegalArgumentException e) {
            System.out.println("Registration failed");
            e.printStackTrace();
        }
    }
}
