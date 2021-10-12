/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linterlinter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test public void checkTest(){
        App test=new App();
        int errors=App.check("Test.txt");

        assertEquals(errors,2);
    }
}