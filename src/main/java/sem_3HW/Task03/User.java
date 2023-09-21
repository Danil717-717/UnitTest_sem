package sem_3HW.Task03;

/*
* Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
 */

public class User {
    String name;
    String password;
    String whoIsIt = "admin";  // поле показывает админ или нет
    boolean isAuthenticate = false; // состояние если true то работем, если false вызываем метод разлогинивания

    public User(String name, String password, String whoIsIt, boolean isAuthenticate) {
        this.name = name;
        this.password = password;
        this.whoIsIt = whoIsIt;
        this.isAuthenticate = isAuthenticate;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }
}
