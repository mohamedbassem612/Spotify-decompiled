package com.spotify.promptablesection;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pg51;
import p.qg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SectionError extends h implements v2j0 {
    private static final SectionError DEFAULT_INSTANCE;
    public static final int ERROR_PROMPT_FIELD_NUMBER = 3;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private int errorType_;
    private String reason_ = "";
    private String errorPrompt_ = "";

    static {
        SectionError sectionError = new SectionError();
        DEFAULT_INSTANCE = sectionError;
        h.registerDefaultInstance(SectionError.class, sectionError);
    }

    private SectionError() {
    }

    public static SectionError n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ለ\u0000", new Object[]{"bitField0_", "errorType_", "reason_", "errorPrompt_"});
        }
        if (iOrdinal == 3) {
            return new SectionError();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (SectionError.class) {
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

    public final String o() {
        return this.errorPrompt_;
    }

    public final qg51 p() {
        qg51 qg51Var;
        int i = this.errorType_;
        if (i == 0) {
            qg51Var = qg51.UNDEFINED;
        } else if (i != 1) {
            qg51Var = i != 2 ? null : qg51.GENERATION_ERROR;
        } else {
            qg51Var = qg51.VALIDATION_ERROR;
        }
        return qg51Var == null ? qg51.UNRECOGNIZED : qg51Var;
    }

    public final String q() {
        return this.reason_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
