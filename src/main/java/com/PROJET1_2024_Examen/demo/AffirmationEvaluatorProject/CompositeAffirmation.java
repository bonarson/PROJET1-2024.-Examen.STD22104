package com.PROJET1_2024_Examen.demo.AffirmationEvaluatorProject;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class CompositeAffirmation extends Affirmation {
    private final Affirmation left;
    private final Affirmation right;
    private final String operator;

    @Override
    boolean evaluate() {
        boolean leftValue = left.evaluate();
        boolean rightValue = right.evaluate();

        if ("et".equals(operator)) {
            return leftValue && rightValue;
        } else if ("ou".equals(operator)) {
            return leftValue || rightValue;
        } else if ("donc".equals(operator)) {
            return !leftValue || rightValue;
        } else {
            throw new IllegalArgumentException("Opérateur inconnu: " + operator);
        }
    }
}