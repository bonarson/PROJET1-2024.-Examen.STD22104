package com.PROJET1_2024_Examen.demo.AffirmationEvaluatorProject;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class SimpleAffirmation extends Affirmation {

    private final boolean value;

    @Override
    boolean evaluate() {
        return value;
    }
}
