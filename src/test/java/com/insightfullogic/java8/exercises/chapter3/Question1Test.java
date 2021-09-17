package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static com.insightfullogic.java8.examples.chapter1.SampleData.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Question1Test {

    @Test
    @Ignore
   public void addsEmptyList() {
        int result = Question1.addUp(Stream.empty());
        assertEquals(0, result);
    }

    @Test
    @Ignore
    public void addsListWithValues() {
        int result = Question1.addUp(Stream.of(1, 3, -2));
        assertEquals(2, result);
    }

    @Test
    @Ignore
    public void extractsNamesAndOriginsOfArtists() {
        List<String> namesAndOrigins = Question1.getNamesAndOrigins(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    @Ignore
   public void findsShortAlbums() {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = Question1.getAlbumsWithAtMostThreeTracks(input);
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }

}
