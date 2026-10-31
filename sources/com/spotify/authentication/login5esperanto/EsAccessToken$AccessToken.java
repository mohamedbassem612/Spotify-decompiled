package com.spotify.authentication.login5esperanto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAccessToken$AccessToken extends h implements v2j0 {
    private static final EsAccessToken$AccessToken DEFAULT_INSTANCE;
    public static final int EXPIRESAT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp expiresAt_;
    private String token_ = "";
    private String type_ = "";

    static {
        EsAccessToken$AccessToken esAccessToken$AccessToken = new EsAccessToken$AccessToken();
        DEFAULT_INSTANCE = esAccessToken$AccessToken;
        h.registerDefaultInstance(EsAccessToken$AccessToken.class, esAccessToken$AccessToken);
    }

    private EsAccessToken$AccessToken() {
    }

    public static EsAccessToken$AccessToken o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "token_", "type_", "expiresAt_"});
        }
        if (iOrdinal == 3) {
            return new EsAccessToken$AccessToken();
        }
        if (iOrdinal == 4) {
            return new rdz((byte) 8);
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
        synchronized (EsAccessToken$AccessToken.class) {
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

    public final Timestamp p() {
        Timestamp timestamp = this.expiresAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final String q() {
        return this.token_;
    }

    public final String r() {
        return this.type_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
