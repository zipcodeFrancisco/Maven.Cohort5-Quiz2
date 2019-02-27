package com.zipcodewilmington.assessment2.part2.router;

import com.zipcodewilmington.assessment2.part2.ListUtility;
import com.zipcodewilmington.assessment2.part2.Router;
import org.junit.Assert;
import org.junit.Test;

public class ToStringTest {
    @Test
    public void test1() {
        // given
        Router router = new Router();
        router.add("/users", "UserController");
        router.add("/students", "StudentController");
        router.add("/instructor", "InstructorController");
        String expectedString = "/instructor -> InstructorController\n"
                + "/students -> StudentController\n"
                + "/users -> UserController\n";

        // when
        String actualString = router.toString();


        // then
        Assert.assertEquals(expectedString, actualString);
    }

}
