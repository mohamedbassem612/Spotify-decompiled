package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class QuestionStep extends h implements v2j0 {
    public static final int ALLOW_USER_ANSWERS_FIELD_NUMBER = 3;
    public static final int ANSWERS_FIELD_NUMBER = 4;
    private static final QuestionStep DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MAX_SELECTED_ANSWER_LIMIT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEHOLDER_USER_ANSWER_TEXT_FIELD_NUMBER = 5;
    private boolean allowUserAnswers_;
    private int bitField0_;
    private int maxSelectedAnswerLimit_;
    private String id_ = "";
    private h290 answers_ = h.emptyProtobufList();
    private String placeholderUserAnswerText_ = "";

    static {
        QuestionStep questionStep = new QuestionStep();
        DEFAULT_INSTANCE = questionStep;
        h.registerDefaultInstance(QuestionStep.class, questionStep);
    }

    private QuestionStep() {
    }

    public static QuestionStep p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002င\u0000\u0003\u0007\u0004\u001b\u0005ለ\u0001", new Object[]{"bitField0_", "id_", "maxSelectedAnswerLimit_", "allowUserAnswers_", "answers_", Answer.class, "placeholderUserAnswerText_"});
        }
        if (iOrdinal == 3) {
            return new QuestionStep();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (QuestionStep.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final boolean n() {
        return this.allowUserAnswers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.answers_;
    }

    public final int q() {
        return this.maxSelectedAnswerLimit_;
    }

    public final String r() {
        return this.placeholderUserAnswerText_;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
