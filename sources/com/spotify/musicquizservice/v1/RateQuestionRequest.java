package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yrz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class RateQuestionRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CLEAR_FIELD_NUMBER = 4;
    private static final RateQuestionRequest DEFAULT_INSTANCE;
    public static final int FEEDBACK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    public static final int QUIZ_URI_FIELD_NUMBER = 2;
    private Object action_;
    private int actionCase_ = 0;
    private String questionId_ = "";
    private String quizUri_ = "";

    static {
        RateQuestionRequest rateQuestionRequest = new RateQuestionRequest();
        DEFAULT_INSTANCE = rateQuestionRequest;
        com.google.protobuf.h.registerDefaultInstance(RateQuestionRequest.class, rateQuestionRequest);
    }

    private RateQuestionRequest() {
    }

    public static yrz0 n() {
        return (yrz0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004:\u0000", new Object[]{"action_", "actionCase_", "questionId_", "quizUri_", QuestionFeedback.class});
        }
        if (iOrdinal == 3) {
            return new RateQuestionRequest();
        }
        if (iOrdinal == 4) {
            return new yrz0(DEFAULT_INSTANCE);
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
        synchronized (RateQuestionRequest.class) {
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

    public final void o() {
        this.actionCase_ = 4;
        this.action_ = Boolean.TRUE;
    }

    public final void p(QuestionFeedback questionFeedback) {
        questionFeedback.getClass();
        this.action_ = questionFeedback;
        this.actionCase_ = 3;
    }

    public final void q(String str) {
        str.getClass();
        this.questionId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.quizUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
