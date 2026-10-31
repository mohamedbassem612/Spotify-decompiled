package com.spotify.musicquizservice.v1;

import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.hyh;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class CompleteQuizRequest extends com.google.protobuf.h implements v2j0 {
    public static final int ANSWERS_FIELD_NUMBER = 3;
    public static final int CHALLENGE_ID_FIELD_NUMBER = 2;
    private static final CompleteQuizRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String quizUri_ = "";
    private String challengeId_ = "";
    private h290 answers_ = com.google.protobuf.h.emptyProtobufList();

    static {
        CompleteQuizRequest completeQuizRequest = new CompleteQuizRequest();
        DEFAULT_INSTANCE = completeQuizRequest;
        com.google.protobuf.h.registerDefaultInstance(CompleteQuizRequest.class, completeQuizRequest);
    }

    private CompleteQuizRequest() {
    }

    public static hyh o() {
        return (hyh) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b", new Object[]{"bitField0_", "quizUri_", "challengeId_", "answers_", ReportAnswer.class});
        }
        if (iOrdinal == 3) {
            return new CompleteQuizRequest();
        }
        if (iOrdinal == 4) {
            return new hyh(DEFAULT_INSTANCE);
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
        synchronized (CompleteQuizRequest.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.answers_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.answers_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.challengeId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.quizUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
