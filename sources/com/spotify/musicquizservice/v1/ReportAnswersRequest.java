package com.spotify.musicquizservice.v1;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ReportAnswersRequest extends com.google.protobuf.h implements v2j0 {
    public static final int ANSWERS_FIELD_NUMBER = 1;
    private static final ReportAnswersRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 2;
    private h290 answers_ = com.google.protobuf.h.emptyProtobufList();
    private String quizUri_ = "";

    static {
        ReportAnswersRequest reportAnswersRequest = new ReportAnswersRequest();
        DEFAULT_INSTANCE = reportAnswersRequest;
        com.google.protobuf.h.registerDefaultInstance(ReportAnswersRequest.class, reportAnswersRequest);
    }

    private ReportAnswersRequest() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"answers_", ReportAnswer.class, "quizUri_"});
        }
        if (iOrdinal == 3) {
            return new ReportAnswersRequest();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ReportAnswersRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
