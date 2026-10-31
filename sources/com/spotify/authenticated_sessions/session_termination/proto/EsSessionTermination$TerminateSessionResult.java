package com.spotify.authenticated_sessions.session_termination.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsSessionTermination$TerminateSessionResult extends h implements v2j0 {
    private static final EsSessionTermination$TerminateSessionResult DEFAULT_INSTANCE;
    public static final int INVALID_REQUEST_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROCESSED_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsSessionTermination$TerminateSessionResult esSessionTermination$TerminateSessionResult = new EsSessionTermination$TerminateSessionResult();
        DEFAULT_INSTANCE = esSessionTermination$TerminateSessionResult;
        h.registerDefaultInstance(EsSessionTermination$TerminateSessionResult.class, esSessionTermination$TerminateSessionResult);
    }

    private EsSessionTermination$TerminateSessionResult() {
    }

    public static EsSessionTermination$TerminateSessionResult p(byte[] bArr) {
        return (EsSessionTermination$TerminateSessionResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", EsSessionTermination$TerminateSessionProcessed.class, EsSessionTermination$TerminateSessionInvalidRequest.class});
        }
        if (iOrdinal == 3) {
            return new EsSessionTermination$TerminateSessionResult();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (EsSessionTermination$TerminateSessionResult.class) {
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

    public final EsSessionTermination$TerminateSessionInvalidRequest n() {
        return this.resultCase_ == 2 ? (EsSessionTermination$TerminateSessionInvalidRequest) this.result_ : EsSessionTermination$TerminateSessionInvalidRequest.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.resultCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
