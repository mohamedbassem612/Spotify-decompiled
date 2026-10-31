package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.jf40;
import p.q3z0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class QuestionScore extends com.google.protobuf.h implements v2j0 {
    private static final QuestionScore DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 3;
    public static final int SELECTED_CHOICE_URI_FIELD_NUMBER = 2;
    public static final int TIME_TO_ANSWER_MS_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int score_;
    private long timeToAnswerMs_;
    private String trackUri_ = "";
    private String selectedChoiceUri_ = "";

    static {
        QuestionScore questionScore = new QuestionScore();
        DEFAULT_INSTANCE = questionScore;
        com.google.protobuf.h.registerDefaultInstance(QuestionScore.class, questionScore);
    }

    private QuestionScore() {
    }

    public static q3z0 n() {
        return (q3z0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0002", new Object[]{"trackUri_", "selectedChoiceUri_", "score_", "timeToAnswerMs_"});
        }
        if (iOrdinal == 3) {
            return new QuestionScore();
        }
        if (iOrdinal == 4) {
            return new q3z0(DEFAULT_INSTANCE);
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
        synchronized (QuestionScore.class) {
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

    public final void o(int i) {
        this.score_ = i;
    }

    public final void p(String str) {
        str.getClass();
        this.selectedChoiceUri_ = str;
    }

    public final void q(long j) {
        this.timeToAnswerMs_ = j;
    }

    public final void r(String str) {
        this.trackUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
