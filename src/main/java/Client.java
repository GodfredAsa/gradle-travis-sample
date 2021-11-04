public abstract class Client {
    private int Id;
    private String name;
    private ServiceLevel serviceLevel;


    public Client(int id, String name, ServiceLevel serviceLevel) {
        Id = id;
        this.name = name;
        this.serviceLevel = serviceLevel;
    }

    public  String getClientName(){
        return this.name;
    };

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
