package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAccessTokenClient$AccessTokenResponse extends h implements v2j0 {
    private static final EsAccessTokenClient$AccessTokenResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        EsAccessTokenClient$AccessTokenResponse esAccessTokenClient$AccessTokenResponse = new EsAccessTokenClient$AccessTokenResponse();
        DEFAULT_INSTANCE = esAccessTokenClient$AccessTokenResponse;
        h.registerDefaultInstance(EsAccessTokenClient$AccessTokenResponse.class, esAccessTokenClient$AccessTokenResponse);
    }

    private EsAccessTokenClient$AccessTokenResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsAccessTokenClient$AccessTokenResponse q(byte[] bArr) {
        return (EsAccessTokenClient$AccessTokenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"response_", "responseCase_", EsAccessToken.AccessToken.class, EsAccessTokenClient$ErrorResponse.class});
        }
        if (iOrdinal == 3) {
            return new EsAccessTokenClient$AccessTokenResponse();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (EsAccessTokenClient$AccessTokenResponse.class) {
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

    public final EsAccessTokenClient$ErrorResponse n() {
        return this.responseCase_ == 2 ? (EsAccessTokenClient$ErrorResponse) this.response_ : EsAccessTokenClient$ErrorResponse.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsAccessToken.AccessToken o() {
        return this.responseCase_ == 1 ? (EsAccessToken.AccessToken) this.response_ : EsAccessToken.AccessToken.o();
    }

    public final boolean p() {
        return this.responseCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
