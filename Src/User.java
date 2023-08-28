public class User {
    private String login;
    Acount acount;

    public User(String password, String login) {
        this.login = login;
        acount = new Acount(password);
    }

    class Acount{
        private String password;

        public Acount(String password) {

            this.password = password;
        }

        public void displayAcount(){
            System.out.println("Account Login successful! Login:" + login + " Password: " +password);
        }
    }
}
