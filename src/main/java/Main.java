import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {



//        Client corporate = new Corporate(1, ServiceLevel.Gold, "Godfred Asmudu Asamoah");
//
//        PrivateClient privateClient =  new PrivateClient(1, "Musa", ServiceLevel.Platinum);
//        System.out.println(corporate.getClientName());

        Corporate c1 = new Corporate(1, "fred", ServiceLevel.Platinum, new AccountManager("A"));



        Register register = new Register(Arrays.asList(
                new Corporate(1, "fred", ServiceLevel.Platinum, new AccountManager("A")),
                new Corporate(2, "fred", ServiceLevel.Platinum, new AccountManager("A")),
                new Corporate(3, "fred", ServiceLevel.Platinum, new AccountManager("A")),
                new PrivateClient(4, "Pa", ServiceLevel.Platinum),
                new PrivateClient(5, "Ga", ServiceLevel.Gold),
                new PrivateClient(6, "Ta", ServiceLevel.Premium),
                new PrivateClient(7, "Za", ServiceLevel.Gold),
                new Corporate(8, "fred", ServiceLevel.Platinum, new AccountManager("A")),
                new PrivateClient(9, "PAa", ServiceLevel.Platinum)
        ));


        System.out.println(register.clientNamesByServiceLevel(ServiceLevel.Gold));
        System.out.println(register.clientNameById(1));

        System.out.println(register.countOfClientsAtServiceLevel(ServiceLevel.Platinum));
//
//       register.getClients().stream()
//               .filter(s->s.getServiceLevel()
//                       .equals(ServiceLevel.Gold))
//               .forEach(System.out::println);








    }

    //
//    private static List<Register> getRegister() {
//        Register register = new Register(Arrays.asList(
//                new Corporate(1, "fred", ServiceLevel.Platinum, new AccountManager("A")),
//                new Corporate(1, "fred", ServiceLevel.Platinum, new AccountManager("A")),
//                new Corporate(1, "fred", ServiceLevel.Platinum, new AccountManager("A")),
//                new PrivateClient(1, "Pa", ServiceLevel.Platinum),
//                new PrivateClient(2, "Ga", ServiceLevel.Gold),
//                new PrivateClient(3, "Ta", ServiceLevel.Premium),
//                new PrivateClient(4, "Za", ServiceLevel.Gold),
//                new Corporate(1, "fred", ServiceLevel.Platinum, new AccountManager("A")),
//                new PrivateClient(1, "PAa", ServiceLevel.Platinum)
//        ));
////
//        return getRegister();
//
//    }
}
