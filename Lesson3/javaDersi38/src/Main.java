public class Main {
    public static void main(String[] args) {
//        BaseLogger[] baseLoggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger()};
//        for (BaseLogger logger:baseLoggers){
//            logger.Log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
