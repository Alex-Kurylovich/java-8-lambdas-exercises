package com.insightfullogic.java8.exercises.chapter3;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringExercisesTest {

    @Test
    @Ignore
    public void noLowercaseLettersInAnEmptyString() {
        assertEquals(0, StringExercises.countLowercaseLetters(""));
    }

    @Test
    @Ignore
   public void countsLowercaseLetterExample() {
        assertEquals(3, StringExercises.countLowercaseLetters("aBcDeF"));
    }

    @Test
    @Ignore
   public void suppoertsNoLowercaseLetters() {
        assertEquals(0, StringExercises.countLowercaseLetters("ABCDEF"));
    }

    @Test
    @Ignore
    public void noStringReturnedForEmptyList() {
        assertFalse(StringExercises.mostLowercaseString(Collections.<String>emptyList()).isPresent());
    }

    @Test
    @Ignore
   public void findsMostLowercaseString() {
        Optional<String> result = StringExercises.mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
        assertEquals(result, Optional.of("abc"));
    }

}
