package com.spotify.musicquizservice.v1;

import com.google.protobuf.Duration;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vj21;
import p.wj21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ReportAnswer extends com.google.protobuf.h implements v2j0 {
    public static final int ANSWER_STATE_FIELD_NUMBER = 2;
    private static final ReportAnswer DEFAULT_INSTANCE;
    public static final int DWELL_TIME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    private int answerState_;
    private int bitField0_;
    private Duration dwellTime_;
    private String questionId_ = "";

    static {
        ReportAnswer reportAnswer = new ReportAnswer();
        DEFAULT_INSTANCE = reportAnswer;
        com.google.protobuf.h.registerDefaultInstance(ReportAnswer.class, reportAnswer);
    }

    private ReportAnswer() {
    }

    public static vj21 n() {
        return (vj21) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "questionId_", "answerState_", "dwellTime_"});
        }
        if (iOrdinal == 3) {
            return new ReportAnswer();
        }
        if (iOrdinal == 4) {
            return new vj21(DEFAULT_INSTANCE);
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
        synchronized (ReportAnswer.class) {
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

    public final void o(wj21 wj21Var) {
        this.answerState_ = wj21Var.getNumber();
    }

    public final void p(Duration duration) {
        this.dwellTime_ = duration;
        this.bitField0_ |= 1;
    }

    public final void q(String str) {
        str.getClass();
        this.questionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
