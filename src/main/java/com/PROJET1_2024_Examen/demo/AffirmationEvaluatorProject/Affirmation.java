package com.PROJET1_2024_Examen.demo.AffirmationEvaluatorProject;

public sealed abstract class Affirmation permits SimpleAffirmation, CompositeAffirmation {
    abstract boolean evaluate();
}
