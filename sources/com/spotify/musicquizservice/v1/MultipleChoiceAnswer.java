package com.spotify.musicquizservice.v1;

import p.bf40;
import p.h290;
import p.jf40;
import p.ljj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MultipleChoiceAnswer extends com.google.protobuf.h implements v2j0 {
    public static final int CORRECT_ANSWER_INDEX_FIELD_NUMBER = 2;
    private static final MultipleChoiceAnswer DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private Object correctAnswerIdentifier_;
    private int correctAnswerIdentifierCase_ = 0;
    private h290 options_ = com.google.protobuf.h.emptyProtobufList();

    static {
        MultipleChoiceAnswer multipleChoiceAnswer = new MultipleChoiceAnswer();
        DEFAULT_INSTANCE = multipleChoiceAnswer;
        com.google.protobuf.h.registerDefaultInstance(MultipleChoiceAnswer.class, multipleChoiceAnswer);
    }

    private MultipleChoiceAnswer() {
    }

    public static MultipleChoiceAnswer o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u00027\u0000", new Object[]{"correctAnswerIdentifier_", "correctAnswerIdentifierCase_", "options_"});
        }
        if (iOrdinal == 3) {
            return new MultipleChoiceAnswer();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (MultipleChoiceAnswer.class) {
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

    public final int n() {
        if (this.correctAnswerIdentifierCase_ == 2) {
            return ((Integer) this.correctAnswerIdentifier_).intValue();
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.options_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
