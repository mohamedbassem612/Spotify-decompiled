package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jkz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAccessTokenClient$GetTokenRequest extends h implements v2j0 {
    private static final EsAccessTokenClient$GetTokenRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RENEW_FIELD_NUMBER = 1;
    private boolean renew_;

    static {
        EsAccessTokenClient$GetTokenRequest esAccessTokenClient$GetTokenRequest = new EsAccessTokenClient$GetTokenRequest();
        DEFAULT_INSTANCE = esAccessTokenClient$GetTokenRequest;
        h.registerDefaultInstance(EsAccessTokenClient$GetTokenRequest.class, esAccessTokenClient$GetTokenRequest);
    }

    private EsAccessTokenClient$GetTokenRequest() {
    }

    public static jkz n() {
        return (jkz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"renew_"});
        }
        if (iOrdinal == 3) {
            return new EsAccessTokenClient$GetTokenRequest();
        }
        if (iOrdinal == 4) {
            return new jkz(DEFAULT_INSTANCE);
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
        synchronized (EsAccessTokenClient$GetTokenRequest.class) {
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

    public final void o() {
        this.renew_ = false;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
