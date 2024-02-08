package dev.asench.weeklydose.codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheLostBeginningTest {

    @Test
    void beginning() {
        assertEquals(1, TheLostBeginning.beginning("123456789101112131415"), "beginning(\"123456789101112131415\")");
        assertEquals(17, TheLostBeginning.beginning("17181920"), "beginning(\"17181920\")");
        assertEquals(72637236, TheLostBeginning.beginning("72637236"), "beginning(\"72637236\")");
        assertEquals(11, TheLostBeginning.beginning("1112"), "beginning(\"1112\")");
        assertEquals(9, TheLostBeginning.beginning("91011"), "beginning(\"91011\")");
        assertEquals(99, TheLostBeginning.beginning("99100"), "beginning(\"99100\")");
    }
}