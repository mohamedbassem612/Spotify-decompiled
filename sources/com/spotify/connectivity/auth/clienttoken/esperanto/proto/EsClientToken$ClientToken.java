package com.spotify.connectivity.auth.clienttoken.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsClientToken$ClientToken extends h implements v2j0 {
    public static final int CLIENT_DATA_HASH_FIELD_NUMBER = 4;
    private static final EsClientToken$ClientToken DEFAULT_INSTANCE;
    public static final int DOMAINS_FIELD_NUMBER = 5;
    public static final int EXPIRES_AT_TIMESTAMP_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REFRESH_AT_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private long expiresAtTimestamp_;
    private long refreshAtTimestamp_;
    private String token_ = "";
    private String clientDataHash_ = "";
    private h290 domains_ = h.emptyProtobufList();

    static {
        EsClientToken$ClientToken esClientToken$ClientToken = new EsClientToken$ClientToken();
        DEFAULT_INSTANCE = esClientToken$ClientToken;
        h.registerDefaultInstance(EsClientToken$ClientToken.class, esClientToken$ClientToken);
    }

    private EsClientToken$ClientToken() {
    }

    public static EsClientToken$ClientToken p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004Ȉ\u0005Ț", new Object[]{"token_", "expiresAtTimestamp_", "refreshAtTimestamp_", "clientDataHash_", "domains_"});
        }
        if (iOrdinal == 3) {
            return new EsClientToken$ClientToken();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 8);
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
        synchronized (EsClientToken$ClientToken.class) {
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

    public final String o() {
        return this.clientDataHash_;
    }

    public final h290 q() {
        return this.domains_;
    }

    public final long r() {
        return this.expiresAtTimestamp_;
    }

    public final long s() {
        return this.refreshAtTimestamp_;
    }

    public final String t() {
        return this.token_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
