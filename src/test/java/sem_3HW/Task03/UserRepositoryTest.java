package sem_3HW.Task03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    UserRepository uR = new UserRepository();
    @Test
    void addUser() {
        uR.addUser(new User("Ivan","123","admin",true));
        //assertEquals(); как проверить куда добавился пользователь? и вообще добавился ли?
    }

    @Test
    void findByName() {
        boolean res = uR.findByName("Ivan");
        assertEquals(true,res);    // тут тоже не совсем понятно скорее всего через лямбды я этого еще не знаю)
    }

    @Test
    void asLogUser() {   // так же и этот метод
    }
}