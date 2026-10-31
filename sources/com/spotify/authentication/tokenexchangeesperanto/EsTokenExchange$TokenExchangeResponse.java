package com.spotify.authentication.tokenexchangeesperanto;

import com.google.protobuf.h;
import com.spotify.authentication.login5esperanto.EsAccessToken;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient$ErrorResponse;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsTokenExchange$TokenExchangeResponse extends h implements v2j0 {
    private static final EsTokenExchange$TokenExchangeResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        EsTokenExchange$TokenExchangeResponse esTokenExchange$TokenExchangeResponse = new EsTokenExchange$TokenExchangeResponse();
        DEFAULT_INSTANCE = esTokenExchange$TokenExchangeResponse;
        h.registerDefaultInstance(EsTokenExchange$TokenExchangeResponse.class, esTokenExchange$TokenExchangeResponse);
    }

    private EsTokenExchange$TokenExchangeResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsTokenExchange$TokenExchangeResponse q(byte[] bArr) {
        return (EsTokenExchange$TokenExchangeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return new EsTokenExchange$TokenExchangeResponse();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (EsTokenExchange$TokenExchangeResponse.class) {
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

    public final int o() {
        int i = this.responseCase_;
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

    public final EsAccessToken.AccessToken p() {
        return this.responseCase_ == 1 ? (EsAccessToken.AccessToken) this.response_ : EsAccessToken.AccessToken.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
