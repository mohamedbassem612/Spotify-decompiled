package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsCodeRequired$CodeRequiredProceedResult extends h implements v2j0 {
    private static final EsCodeRequired$CodeRequiredProceedResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsCodeRequired$CodeRequiredProceedResult esCodeRequired$CodeRequiredProceedResult = new EsCodeRequired$CodeRequiredProceedResult();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequiredProceedResult;
        h.registerDefaultInstance(EsCodeRequired$CodeRequiredProceedResult.class, esCodeRequired$CodeRequiredProceedResult);
    }

    private EsCodeRequired$CodeRequiredProceedResult() {
    }

    public static EsCodeRequired$CodeRequiredProceedResult p(byte[] bArr) {
        return (EsCodeRequired$CodeRequiredProceedResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", EsCodeRequired$CodeRequiredProceedSuccess.class, EsCodeRequired$CodeRequiredProceedError.class});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequiredProceedResult();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (EsCodeRequired$CodeRequiredProceedResult.class) {
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

    public final EsCodeRequired$CodeRequiredProceedError n() {
        return this.resultCase_ == 2 ? (EsCodeRequired$CodeRequiredProceedError) this.result_ : EsCodeRequired$CodeRequiredProceedError.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.resultCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
