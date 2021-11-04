import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

public class CorporateTest extends TestCase {

    @Test
    public void testGetAccountManager() {
        AccountManager accountManager  = new AccountManager("A");
        String name  = accountManager.getName();
        System.out.println(name);

        Corporate corporate1 =
                new Corporate(1, "C",ServiceLevel.Platinum, accountManager);

        Register register = new Register(Arrays.asList(corporate1));
      assertEquals("A",corporate1.getClientName());
    }


//    AM HERE WITH THIS CODE
    @Test
    public void testPrivateClient() {
        PrivateClient p =
                new PrivateClient(1,"DD",ServiceLevel.Platinum);

        Register register = new Register(Arrays.asList(p));

        System.out.println(p.getClientName());
        assertEquals("DD",p.getClientName());

    }

    @Test
    public void testCountClients(){
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

//       assertEquals( register.addMe(1,2), 3);

      assertEquals(register.countOfClientsAtServiceLevel(ServiceLevel.Platinum), 6);
    }

@Test
    public void testClientNameById(){

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

        assertEquals(Optional.of("fred"),register.clientNameById(1));
    }

    @Test
    public void testClientsNameByService(){

        Register register = new Register(Arrays.asList(
                new Corporate(1, "fred", ServiceLevel.Platinum, new AccountManager("A")),
                new Corporate(2, "fred", ServiceLevel.Platinum, new AccountManager("A")),
                new Corporate(3, "fred", ServiceLevel.Platinum, new AccountManager("A")),
                new PrivateClient(4, "Pa", ServiceLevel.Platinum),
                new PrivateClient(5, "Ga", ServiceLevel.Gold),
                new PrivateClient(6, "Ta", ServiceLevel.Premium),
                new PrivateClient(7, "Za", ServiceLevel.Gold),
                new Corporate(8, "fred", ServiceLevel.Platinum,
                        new AccountManager("A")),
                new PrivateClient(9, "PAa", ServiceLevel.Platinum)
        ));



        assertEquals(register.clientNamesByServiceLevel(ServiceLevel.Gold),
                Arrays.asList(register.getClients().get(4).getClientName(), register.getClients().get(6).getClientName()));


    }




}