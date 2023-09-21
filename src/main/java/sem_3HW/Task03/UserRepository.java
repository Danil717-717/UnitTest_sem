package sem_3HW.Task03;

import java.util.ArrayList;
import java.util.List;

/*
* Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
 */

public class UserRepository {
    // Тут можно хранить аутентифицированных пользователей
    List<User> dataAdmin = new ArrayList<>();
    List<User> dataUser = new ArrayList<>();

    public void addUser(User user) {       //сортировка юзеров на админ и юзер и добавление в разные листы
        if(user.whoIsIt.equals("admin")){
            dataAdmin.add(user);
        }else {
            dataUser.add(user);
        }

    }

    public boolean findByName(String username) {
        for (User user : dataAdmin) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        for (User user : dataUser) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void asLogUser(List list){ //метод ралога
        list.clear();
    }
}
