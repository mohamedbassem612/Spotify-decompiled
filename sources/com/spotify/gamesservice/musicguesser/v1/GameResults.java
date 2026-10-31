package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.jf40;
import p.jo41;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GameResults extends com.google.protobuf.h implements v2j0 {
    private static final GameResults DEFAULT_INSTANCE;
    public static final int MAX_SCORE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 1;
    public static final int SCORE_THRESHOLD_FIELD_NUMBER = 7;
    public static final int TIME_TO_ANSWER_MS_FIELD_NUMBER = 3;
    public static final int TOTAL_CORRECT_ANSWERS_FIELD_NUMBER = 4;
    public static final int TOTAL_QUESTIONS_FIELD_NUMBER = 5;
    private int maxScore_;
    private int scoreThreshold_;
    private int score_;
    private long timeToAnswerMs_;
    private int totalCorrectAnswers_;
    private int totalQuestions_;

    static {
        GameResults gameResults = new GameResults();
        DEFAULT_INSTANCE = gameResults;
        com.google.protobuf.h.registerDefaultInstance(GameResults.class, gameResults);
    }

    private GameResults() {
    }

    public static GameResults n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002\u0004\u0004\u0005\u0004\u0007\f", new Object[]{"score_", "maxScore_", "timeToAnswerMs_", "totalCorrectAnswers_", "totalQuestions_", "scoreThreshold_"});
        }
        if (iOrdinal == 3) {
            return new GameResults();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 6);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (GameResults.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.maxScore_;
    }

    public final int p() {
        return this.score_;
    }

    public final jo41 q() {
        jo41 jo41VarA = jo41.a(this.scoreThreshold_);
        return jo41VarA == null ? jo41.UNRECOGNIZED : jo41VarA;
    }

    public final long r() {
        return this.timeToAnswerMs_;
    }

    public final int s() {
        return this.totalCorrectAnswers_;
    }

    public final int t() {
        return this.totalQuestions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
