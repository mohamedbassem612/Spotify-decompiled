package com.spotify.playlist.ai.creation.v2;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum Problem implements v190 {
    PROBLEM_UNSPECIFIED(0),
    PROBLEM_NO_MUSIC(1),
    PROBLEM_UNTRUE_OR_INACCURATE(2),
    PROBLEM_OTHER_OR_GENERIC(3),
    UNRECOGNIZED(-1);

    public static final int PROBLEM_NO_MUSIC_VALUE = 1;
    public static final int PROBLEM_OTHER_OR_GENERIC_VALUE = 3;
    public static final int PROBLEM_UNSPECIFIED_VALUE = 0;
    public static final int PROBLEM_UNTRUE_OR_INACCURATE_VALUE = 2;
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
            return PROBLEM_NO_MUSIC;
        }
        if (i == 2) {
            return PROBLEM_UNTRUE_OR_INACCURATE;
        }
        if (i != 3) {
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

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Problem$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final Problem findValueByNumber(int i) {
            return Problem.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m548findValueByNumber(int i) {
            return Problem.forNumber(i);
        }
    }

    @Deprecated
    public static Problem valueOf(int i) {
        return forNumber(i);
    }
}
