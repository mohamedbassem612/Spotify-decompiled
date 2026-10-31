package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateResult$AuthenticateSuccess extends h implements v2j0 {
    public static final int ACCESSTOKEN_FIELD_NUMBER = 2;
    public static final int AUTHBLOB_FIELD_NUMBER = 3;
    private static final EsAuthenticateResult$AuthenticateSuccess DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private EsAuthBlob$AuthBlob authBlob_;
    private int bitField0_;
    private Object optionalAccessToken_;
    private int optionalAccessTokenCase_ = 0;
    private String username_ = "";

    static {
        EsAuthenticateResult$AuthenticateSuccess esAuthenticateResult$AuthenticateSuccess = new EsAuthenticateResult$AuthenticateSuccess();
        DEFAULT_INSTANCE = esAuthenticateResult$AuthenticateSuccess;
        h.registerDefaultInstance(EsAuthenticateResult$AuthenticateSuccess.class, esAuthenticateResult$AuthenticateSuccess);
    }

    private EsAuthenticateResult$AuthenticateSuccess() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsAuthenticateResult$AuthenticateSuccess q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003ဉ\u0000", new Object[]{"optionalAccessToken_", "optionalAccessTokenCase_", "bitField0_", "username_", EsAccessToken$AccessToken.class, "authBlob_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateResult$AuthenticateSuccess();
        }
        if (iOrdinal == 4) {
            return new rdz((byte) 16);
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
        synchronized (EsAuthenticateResult$AuthenticateSuccess.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsAccessToken$AccessToken o() {
        return this.optionalAccessTokenCase_ == 2 ? (EsAccessToken$AccessToken) this.optionalAccessToken_ : EsAccessToken$AccessToken.o();
    }

    public final EsAuthBlob$AuthBlob p() {
        EsAuthBlob$AuthBlob esAuthBlob$AuthBlob = this.authBlob_;
        return esAuthBlob$AuthBlob == null ? EsAuthBlob$AuthBlob.n() : esAuthBlob$AuthBlob;
    }

    public final boolean r() {
        return this.optionalAccessTokenCase_ == 2;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
