import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {

    private List<Client> clients = new ArrayList<>() ;

    public Register(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getClients() {
        return clients;
    }



    public List<String> clientNamesByServiceLevel(ServiceLevel serviceLevel){
       return clients.stream()
                .filter(
                        s->s.getServiceLevel().equals(serviceLevel))
               .map(s->s.getClientName()).collect(Collectors.toList());

    }

    public Optional<String> clientNameById(int Id){
       return clients.stream()
               .filter(s->s.getId()==Id)
               .map(s->s.getName()).findFirst();
    }

    public int countOfClientsAtServiceLevel(ServiceLevel serviceLevel){
        return clients.stream()
                .filter(s->s.getServiceLevel()
                .equals(serviceLevel)).collect(Collectors.toList()).size();
    }



    @Override
    public String toString() {
        return "Register{" +
                "clients=" + clients +
                '}';
    }
}
