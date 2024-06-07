package com.PROJET1_2024_Examen.demo.AffirmationEvaluatorProject;

import org.junit.jupiter.api.BeforeEach;

public class AffirmationEvaluatorTest {
    private AffirmationEvaluator evaluator;

    @BeforeEach
    void setUp() {
        evaluator = new AffirmationEvaluator();

        evaluator.addAffirmation("vérité_1", new SimpleAffirmation(true));
        evaluator.addAffirmation("mensonge_1", new SimpleAffirmation(false));
        evaluator.addAffirmation("affirmation_1", new SimpleAffirmation(false));
    }

}
