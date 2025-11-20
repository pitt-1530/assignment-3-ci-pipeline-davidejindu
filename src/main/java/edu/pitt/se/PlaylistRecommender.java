package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        int sum = 0;
        if (bpms.isEmpty()) {
            return null;
        }

        for (int i = 0; i < bpms.size(); i++) {
            sum += bpms.get(i);
        }

        double average = sum / bpms.size();

        if (average >= 140) {
            return "HIGH";
        }

        if (average >= 100) {
            return "MEDIUM";
        }

        else {
            return "LOW";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        if (title == null || title.isEmpty()) {
            return false;
        }

        if (title.trim().length() > 30) {
            return false;
        }

        return title.matches("^[A-Za-z ]+$");

    }

    public static int normalizeVolume(int volumeDb) {

        if (volumeDb > 100) {
            return 100;
        }

        if (volumeDb < 0) {
            return 0;
        }

        return volumeDb;
    }
}
