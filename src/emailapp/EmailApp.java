package emailapp;

public class EmailApp {
    public static void main(String[] args) {

        Email email1 = new Email("SAID","BENAISSA");
        System.out.println(email1.showInfo());
        //email1.changePassword("111111111");
//        email1.setMailboxCapacity(900);
//        email1.setAlternateEmail("d.sbenaissa@gmail.com");
//
//        System.out.println("Email1: alternate email: "+email1.getAlternateEmail());
//        System.out.println("Email1: password: "+email1.getPassword());
//        System.out.println("Email1 capacity: "+email1.getMailboxCapacity());

    }
}
