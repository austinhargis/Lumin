/*
 * This source file was generated by the Gradle 'init' task
 */
package org.hargisa;

import org.junit.Test;
import static org.junit.Assert.*;

public class JLSTest {
    @Test public void appHasAGreeting() {
        JLS classUnderTest = new JLS();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
