public class Corporate extends Client {
    private AccountManager accountManager;

    public Corporate(int id, String name, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(id, name, serviceLevel);
        this.accountManager = accountManager;
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public String getClientName() {
        return accountManager.getName();
    }

    @Override
    public String toString() {
        return "Corporate{" +
                "accountManager=" + accountManager +
                '}';
    }
}
