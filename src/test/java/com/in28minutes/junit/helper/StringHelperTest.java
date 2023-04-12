package com.in28minutes.junit.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

    StringHelper helper;

    @Before
    public void before() {
        helper = new StringHelper();
    }


    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AnotInAnyPosition() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinLastPosition() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void testTruncateAInFirst2Positions_EmptyValue() {
        assertEquals("", helper.truncateAInFirst2Positions(""));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2PositionItself() {
        assertEquals("", helper.truncateAInFirst2Positions("AA"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinAllPositions() {
        assertEquals("AA", helper.truncateAInFirst2Positions("AAAA"));
    }

    // ABCD => false, ABAB => true, AB => true, A => false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicEmptyCaseNegativeScenario() {
//        assertFalse("Empty String provided",helper.areFirstAndLastTwoCharactersTheSame(""));
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame(""));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_2UniquePositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_1UniqueNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }


}
