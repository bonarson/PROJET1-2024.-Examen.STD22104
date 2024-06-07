package com.PROJET1_2024_Examen.demo.AffirmationEvaluatorProject;

import java.util.HashMap;
import java.util.Map;

public class AffirmationEvaluator {
    private final Map<String, Affirmation> affirmations = new HashMap<>();

    public void addAffirmation(String name, Affirmation affirmation) {
        affirmations.put(name, affirmation);
    }

    public Affirmation getAffirmation(String name) {
        return affirmations.get(name);
    }

    public void removeAffirmation(String name) {
        affirmations.remove(name);
    }

    public String evaluate(String name) {
        Affirmation affirmation = affirmations.get(name);
        if (affirmation == null) {
            return "jenesaispas";
        }
        try {
            return affirmation.evaluate() ? "vrai" : "faux";
        } catch (Exception e) {
            return "jenesaispas";
        }
    }
}
