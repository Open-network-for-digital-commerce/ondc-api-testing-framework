package examples.users;
import com.intuit.karate.junit5.Karate;

class Runner {

    @Karate.Test
    Karate testUsers() {
        return new Karate().feature("users").relativeTo(getClass());
    }



}
