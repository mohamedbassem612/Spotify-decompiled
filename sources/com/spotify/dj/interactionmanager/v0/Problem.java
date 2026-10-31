package com.spotify.dj.interactionmanager.v0;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum Problem implements v190 {
    PROBLEM_UNSPECIFIED(0),
    PROBLEM_WRONG_MUSIC(1),
    PROBLEM_MISUNDERSTOOD_WORDS(2),
    PROBLEM_INACCURATE_STATEMENT(3),
    PROBLEM_MISPRONUNCIATION(4),
    PROBLEM_OTHER_OR_GENERIC(5),
    UNRECOGNIZED(-1);

    public static final int PROBLEM_INACCURATE_STATEMENT_VALUE = 3;
    public static final int PROBLEM_MISPRONUNCIATION_VALUE = 4;
    public static final int PROBLEM_MISUNDERSTOOD_WORDS_VALUE = 2;
    public static final int PROBLEM_OTHER_OR_GENERIC_VALUE = 5;
    public static final int PROBLEM_UNSPECIFIED_VALUE = 0;
    public static final int PROBLEM_WRONG_MUSIC_VALUE = 1;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class ProblemVerifier implements z190 {
        static final z190 INSTANCE = new ProblemVerifier();

        private ProblemVerifier() {
        }

        public final boolean isInRange(int i) {
            return Problem.forNumber(i) != null;
        }
    }

    Problem(int i) {
        this.value = i;
    }

    public static Problem forNumber(int i) {
        if (i == 0) {
            return PROBLEM_UNSPECIFIED;
        }
        if (i == 1) {
            return PROBLEM_WRONG_MUSIC;
        }
        if (i == 2) {
            return PROBLEM_MISUNDERSTOOD_WORDS;
        }
        if (i == 3) {
            return PROBLEM_INACCURATE_STATEMENT;
        }
        if (i == 4) {
            return PROBLEM_MISPRONUNCIATION;
        }
        if (i != 5) {
            return null;
        }
        return PROBLEM_OTHER_OR_GENERIC;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ProblemVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.Problem$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final Problem findValueByNumber(int i) {
            return Problem.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m61findValueByNumber(int i) {
            return Problem.forNumber(i);
        }
    }

    @Deprecated
    public static Problem valueOf(int i) {
        return forNumber(i);
    }
}
