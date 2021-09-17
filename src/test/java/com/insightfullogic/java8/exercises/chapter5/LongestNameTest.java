package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

public class LongestNameTest {

    @Test
    @Ignore
    public void findsLongestNameByReduce() {
        Artist artist = LongestName.byReduce(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

    @Test
    @Ignore
    public void findsLongestNameByCollecting() {
        Artist artist = LongestName.byCollecting(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

}
