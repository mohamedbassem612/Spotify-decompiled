package com.spotify.musicquizservice.v1;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.w1z0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class QuestionFeedback extends com.google.protobuf.h implements v2j0 {
    private static final QuestionFeedback DEFAULT_INSTANCE;
    public static final int FEEDBACK_CONTEXT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 1;
    public static final int SELECTED_REASONS_FIELD_NUMBER = 3;
    public static final int TEXT_FEEDBACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private int rating_;
    private String textFeedback_ = "";
    private h290 selectedReasons_ = com.google.protobuf.h.emptyProtobufList();
    private String feedbackContext_ = "";

    static {
        QuestionFeedback questionFeedback = new QuestionFeedback();
        DEFAULT_INSTANCE = questionFeedback;
        com.google.protobuf.h.registerDefaultInstance(QuestionFeedback.class, questionFeedback);
    }

    private QuestionFeedback() {
    }

    public static w1z0 o() {
        return (w1z0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002ለ\u0000\u0003Ț\u0004ለ\u0001", new Object[]{"bitField0_", "rating_", "textFeedback_", "selectedReasons_", "feedbackContext_"});
        }
        if (iOrdinal == 3) {
            return new QuestionFeedback();
        }
        if (iOrdinal == 4) {
            return new w1z0(DEFAULT_INSTANCE);
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
        synchronized (QuestionFeedback.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.selectedReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.selectedReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(int i) {
        this.rating_ = i;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.textFeedback_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
