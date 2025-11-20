package edu.pitt.se;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlaylistRecommenderTest {

    @Test
    public void testEnergy() {
        ArrayList<Integer> bpms1 = new ArrayList<>(3);
        bpms1.add(200);
        bpms1.add(200);
        bpms1.add(1);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms1));

        ArrayList<Integer> bpms2 = new ArrayList<>(1);
        bpms2.add(100);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms2));

        ArrayList<Integer> bpms3 = new ArrayList<>(2);
        bpms3.add(100);
        bpms3.add(300);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms3));

        ArrayList<Integer> bpms4 = new ArrayList<>(2);
        bpms4.add(100);
        bpms4.add(21);
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(bpms4));

    }
}
