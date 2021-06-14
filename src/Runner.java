public class Runner {
    public static void main(String[] args) {
        Register r = new Register();
        Date d = new Date(11,12,2000);
        Address a = new Address("Blah",12,"boo");
        //Administrator ad = new Administrator("Kala","Billa","Kala","Billa");
        //r.Registration(ad);

        TicketSeller t = new TicketSeller("Hottie","Sexy",d,d,a,"123","123");
        TicketSeller t1 = new TicketSeller("Hottdasie","Sedsaxy",d,d,a,"123","123");

        r.Registration(t);
        r.Registration(t1);



        Filing fi = new Filing();

        fi.displayFromFile(new TicketSeller());
        System.out.println(fi.NumberOf(new TicketSeller()));

        //fi.updateFromFile(new TicketSeller(),"Hottdasie" ,t);

       // fi.displayFromFile(new TicketSeller());

        //Login l = new Login();

    }
}
