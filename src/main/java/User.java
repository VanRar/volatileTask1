public class User extends Thread {
    public static final int SLEEP_TIME = 3000;
    private String name;
    private Toy toy;
    private int count;

    public User(String name, Toy toy, int count) {
        this.name = name;
        this.toy = toy;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!toy.tumblerIsOn()) {
                toy.setTumbler(true);
                System.out.println("пользователь " + name + ", нажал вкл.");
            }
        }
    }
}