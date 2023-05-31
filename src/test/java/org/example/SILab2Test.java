package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    List<User> allUsers = new ArrayList<>();

    @Test
    public void function() {
        System.out.println("Every branch test");

        RuntimeException re;
        //Null user
        re = assertThrows(RuntimeException.class,()->SILab2.function(null,allUsers));
        assertTrue(re.getMessage().contains("Mandatory information missing!"));

        //Null name
        User userWithNullName = new User(null, "goce123", "goceoh@hotmail.com");
        assertFalse(SILab2.function(userWithNullName, allUsers));





        System.out.println("Multiple conditions test");
        // True || x || x
        re = assertThrows(RuntimeException.class,()->SILab2.function(null,allUsers));
        assertTrue(re.getMessage().contains("Mandatory information missing!"));

        // False || False || False
        User user = new User("pece", "peciobitola", "pece.bt@hotmail.com");
        assertFalse(SILab2.function(user, allUsers));

        // False || False || True
        User user1 = new User("andrej", "programer123", null);
        re = assertThrows(RuntimeException.class,()->SILab2.function(user1,allUsers));
        assertTrue(re.getMessage().contains("Mandatory information missing!"));

        //False || True || x
        User user2 = new User("ljupco",null,"email");
        re = assertThrows(RuntimeException.class,()->SILab2.function(user2,allUsers));
        assertTrue(re.getMessage().contains("Mandatory information missing!"));

        System.out.println("Multiple conditions test finished");

    }
}

