public class Main {
    public static void main(String[] args) {

        //создаем наши классы
        Toy toy = new Toy();
        User user = new User("Майкл", toy, 5);

        //запускаем потоки
        user.start();
        toy.start();

        //завершаем потоки
        try {
            user.join();
            toy.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}