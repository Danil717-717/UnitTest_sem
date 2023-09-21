package sem_3HW;

import seminar_3.Task01;

public class Task02 {
    /*
     Разработайте и протестируйте метод numberInInterval, который проверяет,
      попадает ли переданное число в интервал (25;100)
     */

    public boolean numberInInterval(int n) {

       // if((n<25) & (n>100))return false; - так почему то не работает
        if (n < 25){
            return false;
        }
        if(n > 100){
            return false;
        }
        return true;
    }

}
