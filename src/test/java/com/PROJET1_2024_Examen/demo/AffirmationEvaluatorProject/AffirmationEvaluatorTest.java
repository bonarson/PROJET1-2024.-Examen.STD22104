package com.PROJET1_2024_Examen.demo.AffirmationEvaluatorProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AffirmationEvaluatorTest {
    private AffirmationEvaluator evaluator;

    @BeforeEach
    void setUp() {
        evaluator = new AffirmationEvaluator();

        evaluator.addAffirmation("vérité_1", new SimpleAffirmation(true));
        evaluator.addAffirmation("mensonge_1", new SimpleAffirmation(false));
        evaluator.addAffirmation("affirmation_1", new SimpleAffirmation(false));

        evaluator.addAffirmation("louEstPauvreEtLouEstGénéreux", new CompositeAffirmation(
                evaluator.getAffirmation("mensonge_1"),
                evaluator.getAffirmation("affirmation_1"),
                "et"
        ));

        evaluator.addAffirmation("louEstBeauDoncLouEstPauvre", new CompositeAffirmation(
                evaluator.getAffirmation("vérité_1"),
                evaluator.getAffirmation("mensonge_1"),
                "donc"
        ));

        evaluator.addAffirmation("louEstPauvreDoncLouEstGénéreux", new CompositeAffirmation(
                evaluator.getAffirmation("mensonge_1"),
                evaluator.getAffirmation("affirmation_1"),
                "donc"
        ));

        evaluator.addAffirmation("louEstBeauOuLouEstGénéreuxDoncLouEstPauvre", new CompositeAffirmation(
                new CompositeAffirmation(
                        evaluator.getAffirmation("vérité_1"),
                        evaluator.getAffirmation("affirmation_1"),
                        "ou"
                ),
                evaluator.getAffirmation("mensonge_1"),
                "donc"
        ));
    }

    @Test
    void testLouEstPauvreEtLouEstGénéreux() {
        assertEquals("faux", evaluator.evaluate("louEstPauvreEtLouEstGénéreux"));
    }

    @Test
    void testLouEstBeauDoncLouEstPauvre() {
        assertEquals("faux", evaluator.evaluate("louEstBeauDoncLouEstPauvre"));
    }
}
