package com.spotify.authentication.tokenexchangeesperanto;

import com.google.protobuf.h;
import p.bf40;
import p.bsz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsTokenExchange$WebAuthTokenRequest extends h implements v2j0 {
    public static final int AUDIENCE_FIELD_NUMBER = 1;
    private static final EsTokenExchange$WebAuthTokenRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String audience_ = "";

    static {
        EsTokenExchange$WebAuthTokenRequest esTokenExchange$WebAuthTokenRequest = new EsTokenExchange$WebAuthTokenRequest();
        DEFAULT_INSTANCE = esTokenExchange$WebAuthTokenRequest;
        h.registerDefaultInstance(EsTokenExchange$WebAuthTokenRequest.class, esTokenExchange$WebAuthTokenRequest);
    }

    private EsTokenExchange$WebAuthTokenRequest() {
    }

    public static bsz n() {
        return (bsz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"audience_"});
        }
        if (iOrdinal == 3) {
            return new EsTokenExchange$WebAuthTokenRequest();
        }
        if (iOrdinal == 4) {
            return new bsz(DEFAULT_INSTANCE);
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
        synchronized (EsTokenExchange$WebAuthTokenRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.audience_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
