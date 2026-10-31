package com.spotify.connectivity.auth.clienttoken.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsClientToken$AcquireResult extends h implements v2j0 {
    private static final EsClientToken$AcquireResult DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsClientToken$AcquireResult esClientToken$AcquireResult = new EsClientToken$AcquireResult();
        DEFAULT_INSTANCE = esClientToken$AcquireResult;
        h.registerDefaultInstance(EsClientToken$AcquireResult.class, esClientToken$AcquireResult);
    }

    private EsClientToken$AcquireResult() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsClientToken$AcquireResult s(byte[] bArr) {
        return (EsClientToken$AcquireResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", EsClientToken$ClientToken.class, EsClientToken$AcquireFailure.class});
        }
        if (iOrdinal == 3) {
            return new EsClientToken$AcquireResult();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 7);
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
        synchronized (EsClientToken$AcquireResult.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsClientToken$AcquireFailure o() {
        return this.resultCase_ == 2 ? (EsClientToken$AcquireFailure) this.result_ : EsClientToken$AcquireFailure.p();
    }

    public final EsClientToken$ClientToken p() {
        return this.resultCase_ == 1 ? (EsClientToken$ClientToken) this.result_ : EsClientToken$ClientToken.p();
    }

    public final boolean q() {
        return this.resultCase_ == 2;
    }

    public final boolean r() {
        return this.resultCase_ == 1;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
